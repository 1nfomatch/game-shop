const scrollThreshold = 0.85;
let lockGettingGames = false;
let page = 1;

window.onload = async () => {
    const cart = JSON.parse(localStorage.getItem('cart')) || [];
    document.querySelector("#cartElemCount").innerText = cart.length;
    await getAndAppendGames(cart);
}

window.addEventListener('scroll', async function () {
    // Если заблокировано действие на получение игр, то ничего не делаем
    if (lockGettingGames) {
        return;
    }

    // Вычисляем высоту документа
    var documentHeight = document.documentElement.scrollHeight;

    // Вычисляем высоту видимой области окна браузера
    var windowHeight = window.innerHeight;

    // Вычисляем текущую позицию прокрутки
    var scrollPosition = window.scrollY || window.pageYOffset || document.body.scrollTop + (document.documentElement && document.documentElement.scrollTop || 0);

    // Вычисляем, когда достигнут порог в 70% от высоты документа
    if ((scrollPosition + windowHeight) / documentHeight > scrollThreshold) {
        lockGettingGames = true;
        const cart = JSON.parse(localStorage.getItem('cart')) || [];
        await getAndAppendGames(cart);
        lockGettingGames = false;
    }
});

async function getAndAppendGames(cart) {
    try {
        const response = await fetch(`/games?page=${page}`);
        if (response.ok) {

            const games = await response.json();

            const gameContainer = document.getElementById('game-card-container');

            for (const index in games) {
                const newCard = buildGameCard(games[index], cart);
                gameContainer.appendChild(newCard);
            }

            page += 1;
        } else {
            console.error('Failed to fetch games. Status:', response.status);
        }
    } catch (error) {
        console.error('Error fetching games:', error);
    }
}

function buildGameCard(game, cart) {
    const newCard = document.createElement('div');
    newCard.classList.add('col');
    newCard.id = `gameCard-${game.id}`;

    newCard.innerHTML = `
        <div class="card card-clickable" data-game-id="${game.id}" onclick="openGameModal(event)">
            <div class="position-relative">
                <button type="button" class="btn btn-add-to-cart position-absolute top-0 end-0 mt-2 me-2" onclick="toggleCart(event)">
                    <span id="addCartIcon_${game.id}" class="icon">&#10010;</span>
                    <span id="removeCartIcon_${game.id}" class="icon" style="display: none;">&#10005;</span>
                </button>
                <img src="${game.background_image}" class="card-img-top card-image" alt="Game Image"/>
            </div>
            <div class="card-body">
                <h5 class="card-title">${game.name}</h5>
                <p class="card-text">Genres: ${game.genres.map(genre => genre.name).join(', ')}</p>
            </div>
            <div class="card-footer">
                <small class="text-muted">Released: ${game.released}</small>
            </div>
        </div>
        `;

    const index = cart.findIndex(item => item == game.id);
    updateGameCardCartButton(newCard, game.id, index !== -1)
    return newCard;
}

function updateGameCardCartButton(gameCard, gameId, isInCart) {

    const addToCartButton = gameCard.querySelector(`#addCartIcon_${gameId}`);
    const removeFromCartButton = gameCard.querySelector(`#removeCartIcon_${gameId}`);

    if (isInCart) {
        addToCartButton.style.display = 'none';
        removeFromCartButton.style.display = 'block';
    } else {
        addToCartButton.style.display = 'block';
        removeFromCartButton.style.display = 'none';
    }
}