let inputVal=document.querySelectorAll('button');
let display=document.getElementById("input");
console.log(inputVal);
inputVal.forEach(inputVal=>{
    inputVal.addEventListener('click',(e)=>{
        if(e.target.textContent==='AC')
        {
            display.innerHTML="";
        }else if(e.target.textContent==='=')
        {
            display.innerHTML=eval(display.innerHTML);
        
        }
        else{
            display.innerHTML+=e.target.textContent;
        }
    })
})