que = [
    {
        question:"Sun rises in the ______",
        Options:['east','west','north','west'],
        ans:0
    },{
        question:"Capital of india",
        Options:['agra','jammu & kashmir','goa','delhi'],
        ans:3
    },{
        question:"Prime minister of india",
        Options:['r.n.kovind','jagan','modi','venkaiah'],
        ans:2
    },{
        question:"odd one out",
        Options:['east','south-east','north','west'],
        ans:1
    },{
        question:"what is the name of our planet",
        Options:['earth','sun','india','neptune'],
        ans:0
    }
]
let cor = [0];
let quest = document.querySelector('.quest-head');
let button = document.querySelector('#submit');
let opt = document.querySelector('.options');
let index = 0;
let qans = ''
let reloadQuestion = ()=>{
    if(index == 5){
        document.querySelector('.container').innerHTML = '<h1>result</h1><br/><span>'+cor+'/5</span><br><button onclick="window.location.reload()">Reload</button>'
        return ""
    }
    quest.innerHTML = que[index].question;
    que[index].Options.forEach((e,i)=>{
        opt.innerHTML+="<div class='ans'> <input type='radio' name='opt' id='opt"+i+"'/><label for='opt"+i+"'>  "+e+"</label></div> <br/>"
    })
    let ans = document.querySelectorAll('.ans')
    ans.forEach((e,i)=>{
        e.addEventListener('click',()=>{
            qans = i;
        })
    })
}
reloadQuestion();
button.addEventListener('click',()=>{
    if(qans === que[index].ans)
        cor[0]+=1
    index++;
    qans = ""
    quest.innerHTML = ''
    opt.innerHTML = ''
    console.log(cor[0])
    reloadQuestion()
})