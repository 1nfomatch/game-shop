var cartModal = bootstrap.Modal.getOrCreateInstance('#cartModal');

async function openCartModal(event) {
    event.preventDefault();
    event.stopPropagation();
    const cartGameList = document.getElementById('cartGameList');
    if (cartGameList) {
        const cart = JSON.parse(localStorage.getItem('cart')) || [];

        await updateCartModal(cartGameList, cart)
    }
}

async function updateCartModal(cartGameList, cart) {
    try {
        const response = await fetch(`/games`, {
            method: "post",
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(cart)
        });
        if (response.ok) {
            const gamesData = await response.json();

            cartGameList.innerHTML = '';

            gamesData.forEach(game => {
                const gameItem = document.createElement('div');
                gameItem.classList.add('game-item', 'd-flex', 'align-items-center', 'mb-3', 'p-3', 'border', 'rounded');
                gameItem.setAttribute('data-game-id', game.id);
                gameItem.innerHTML = `
                    <img class="game-image" src="${game.background_image}" alt="Game Image">
                    <div>
                        <div class="game-title">${game.name}</div>
                        <div class="game-price">${game.price}$</div>
                    </div>
                    <button type="button" class="btn btn-add-to-cart position-absolute end-0" style="margin-right: 40px" 
                        onclick="removeElementFromCartModal(event)">
                        <span id="removeCartIcon_${game.id}" class="icon" style="display: block;">&#10005;</span>
                    </button>
                `;

                cartGameList.appendChild(gameItem);
            });

            cartModal.show();
        } else {
            console.error('Failed to fetch cart. Status:', response.status);
        }
    } catch (error) {
        console.error('Error fetching cart:', error);
    }
}

function removeElementFromCartModal(event) {
    const gameItem = event.target.closest('.game-item');
    if (gameItem) {
        const gameId = gameItem.getAttribute('data-game-id');
        const gameCard = document.querySelector('#gameCard-' + gameId)
            .querySelector('.card');

        gameItem.remove();
        directToggleCart(gameCard);
    }
}