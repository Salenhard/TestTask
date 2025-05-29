window.onload = function () {
    index();
}

function index() {
    const tg = window.Telegram.WebApp;
    tg.ready(); // Инициализация Web App
    const user = tg.initDataUnsafe.user;
    console.log(user)
    console.log(tg.initData);
    fetch('/api/auth/telegram', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: `initData=${encodeURIComponent(window.Telegram.WebApp.initData)}`
    })
    .then(response => response.json())
    .then(data => console.log('Authenticated:', data));
}