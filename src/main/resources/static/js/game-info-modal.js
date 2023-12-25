/* Скрипт для обновления содержимого модального окна */
var gameModal = bootstrap.Modal.getOrCreateInstance('#gameModal');

/* Функция для обновления содержимого модального окна через AJAX */
function updateGameModal(gameId) {
    $.ajax({
        type: 'GET',
        url: '/games/' + gameId,
        success: function (gameDetailed) {
            var game = gameDetailed.game;
            var screenshots = gameDetailed.screenshots;

            document.getElementById('gameModalTitle').innerText = game.name;
            document.getElementById('gameModalDescription').innerHTML = game.description;

            var carouselInner = document.querySelector('#carouselExample .carousel-inner');
            carouselInner.innerHTML = '';
            screenshots.forEach(function (screenshot, index) {
                var item = document.createElement('div');
                item.className = index === 0 ? 'carousel-item active' : 'carousel-item';
                item.innerHTML = '<img src="' + screenshot.image + '" class="d-block w-100" alt="Additional Image">';
                carouselInner.appendChild(item);
            });

            document.getElementById('gameModalPlatforms').innerText = game.platforms
                .map(platform=>platform.platform.name).join(', ');
            document.getElementById('gameModalGenres').innerText = game.genres
                .map(genre => genre.name).join(', ');
            document.getElementById('gameModalDeveloper').innerText = game.developers[0].name;
            document.getElementById('gameModalReleaseDate').innerText = game.released;
            document.getElementById('gameModalPublisher').innerText = game.publishers[0].name;
            gameModal.show();
        },
        error: function (xhr, status, error) {
            console.error('Error fetching game details:', error);
        }
    });
}

function openGameModal(event) {
    event.preventDefault();
    event.stopPropagation();
    const gameCard = event.target.closest('.card');

    if (gameCard) {
        const gameId = gameCard.getAttribute('data-game-id');
        updateGameModal(gameId);
    }
}