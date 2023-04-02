let retrive = async ()=>{
    let dataRes = await fetch('https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=3fd2be6f0c70a2a598f084ddfb75487c&page=1');
    let data = await dataRes.json()
    funcTable(data.results);
}
let headerSearch = document.querySelector('#headerSearch')
let searchButton = document.querySelector('#searchButton');
searchButton.addEventListener('click',async ()=>{
    container.innerHTML = '';
    let dataRes = await fetch(search+headerSearch.value);
    let data = await dataRes.json()
    if(data.results.length == 0){
        let resultsNotFound = document.querySelector('.resultsNotFound');
        resultsNotFound.innerHTML = `
        <h1>Results not found for query ' ${headerSearch.value} '</h1>
        `
    }
    else
    funcTable(data.results); 
})
const search = 'https://api.themoviedb.org/3/search/movie?api_key=3fd2be6f0c70a2a598f084ddfb75487c&query=';
retrive()

let container = document.querySelector('.container');
const funcTable = (data) =>{
    document.querySelector('.resultsNotFound').innerHTML = ""
        data.forEach(e => {
            console.log(e.overview)
            container.innerHTML += `
            <div class="image">
                <img src = 'https://image.tmdb.org/t/p/w200${e.poster_path}' />
                <div class="rating">
                    Rating : ${e.vote_average}
                </div>
                <div class="desc">
                    ${e.overview}
                </div>
            </div>
            `
    });
}