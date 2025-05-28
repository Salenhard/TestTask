window.onload = function () {
    index();
}

function index() {
    const tg = window.Telegram.WebApp;
    tg.ready(); // Инициализация Web App
    const user = tg.initDataUnsafe.user;
    console.log(user);
}