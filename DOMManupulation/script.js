let para = document.querySelector('#paraGraph')
para.addEventListener('mouseover',()=>{
    para.style.color='red'
})
para.addEventListener('mouseout',()=>{
    para.style.color='black'
})
let btn = document.querySelector('#btn')
btn.addEventListener('mouseover',()=>{
    btn.innerHTML='Submit'
})
btn.addEventListener('mouseout',()=>{
    btn.innerHTML='Click'
})
let clickInput = document.querySelector('#clickInput');
clickInput.addEventListener('click',()=>{
    para.innerHTML = document.querySelector('#input').value;
})
let arr = document.querySelectorAll('.list')
arr.forEach((e)=>{
    e.addEventListener('mouseover',()=>{
        e.style.color='red';
        e.style.fontWeight='bolder';
    })
    e.addEventListener('mouseout',()=>{
        e.style.color='black';
        e.style.fontWeight='lighter';
    })
})