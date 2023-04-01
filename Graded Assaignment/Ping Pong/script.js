let left = document.querySelector('#left');
let right = document.querySelector('#right');
let ball = document.querySelector('#ball');
let sleft = document.querySelector('#scoreP1');
let sright = document.querySelector('#scoreP2');
let x = 290; 
let y = 190;
let speedX = 5; 
let speedY = 5;
let leftY = 150; 
let rightY = 150;
let lValue = 0; 
let rValue = 0;
setInterval(()=> {
    x += speedX;
    y += speedY;
    if (y <= 0 || y >= 385) {
        speedY = -speedY;
    }
    if (x <= 30 && y >= leftY && y <= leftY + 70) {
        speedX = -speedX;
    }
    if (x >= 560 && y >= rightY && y <= rightY + 70) {
        speedX = -speedX;
    }
    if (x <= 0) {
        rValue++;
        sright.innerHTML = rValue;
        x = 290;
        y = 190;
        speedX = -speedX;
    }

    if (x >= 585) {
        lValue++;
        sleft.innerHTML = lValue;
        x = 290;
        y = 190;
        speedX = -speedX;
    }
    ball.style.left = x + 'px';
    ball.style.top = y + 'px';
    left.style.top = leftY + 'px';
    right.style.top = rightY + 'px';
}, 50); 
document.addEventListener('keydown', (e) => {
    if (e.keyCode === 87) {
        leftY -= 10;
    }
    if (e.keyCode === 83) {
        leftY += 10;
    }
    if (e.keyCode === 38) {
        rightY -= 10;
    }
    if (e.keyCode === 40) {
        rightY += 10;
    }
}); 