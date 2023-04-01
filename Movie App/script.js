let retrive = async ()=>{
    let dataRes = await fetch('https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=3fd2be6f0c70a2a598f084ddfb75487c&page=1');
    let data = await dataRes.json()
    funcTable(data.results);
}
retrive()
let container = document.querySelector('.container');
const funcTable = (data) =>{
    console.log(data[0])
    data.forEach(e => {
        container.innerHTML += `<div class="image"><img src = 'https://image.tmdb.org/t/p/w200${e.poster_path}'><div class="rating">Rating : ${e.vote_average}</div></div>`
    });
}