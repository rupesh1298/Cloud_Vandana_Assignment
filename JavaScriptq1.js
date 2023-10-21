let sentence="This is a sunny day";
let result="";

//-------------------------------*1st Way*-------------------------------------------------------------//

//seperate by space
// let arr=sentence.split(" ");
// for(let s of arr)
// {
//     //seperate each character of string then reverse and then join it
//     let newArr=s.split("").reverse().join("");
//     //to give space aftr each word
//     result+=newArr+" ";

// }
// console.log(result);


//----------------------------2nd Way-------------------------------------------------------------//
let revSen="";
let normSen="";
for(let i=0;i<sentence.length;i++){
    if(sentence[i]!==' ' && i< sentence.length-1){
        normSen=sentence[i]+normSen;
        console.log("Normal "+normSen);
    }else{
        //when its come on last
        if(i=== sentence.length-1){
            normSen=sentence[i]+normSen;
        }
        revSen+=normSen+' ';
        //console.log("Rev "+revSen)
        //make it empty for next use
        normSen=" ";
    }
}
console.log(revSen)


