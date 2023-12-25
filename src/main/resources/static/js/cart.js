let cartElemCount = 0;

function toggleCart(event) {
    event.stopPropagation();
    const gameCard = event.target.closest('.card');
    directToggleCart(gameCard);
}

function directToggleCart(gameCard) {
    if (gameCard) {
        const gameId = gameCard.getAttribute('data-game-id');
        console.log(gameId);
        const cart = JSON.parse(localStorage.getItem('cart')) || [];
        const index = cart.findIndex(item => item === gameId);

        if (index !== -1) {
            cart.splice(index, 1);
        } else {
            cart.push(gameId);
        }

        document.querySelector("#cartElemCount").innerText = cart.length;
        localStorage.setItem('cart', JSON.stringify(cart));

        updateGameCardCartButton(gameCard, gameId, index === -1);
    }
}