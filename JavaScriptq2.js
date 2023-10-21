let arr=[2,1,4,5,3,9,6,7];

//--------------------------1st way-------------------------------------------
// //in ascending order
// console.log(arr.sort());
// //in descending order
// console.log(arr.sort((a,b)=>b-a));

// let arr1=['a','b','c','m','n','x'];
// //in ascending order
// console.log(arr1.sort());
// //in descending order
// console.log(arr1.sort((a,b)=>b.localeCompare(a)));

//-------------------------------2nd Way--------------------------------------

for(let i=0;i<arr.length;i++)
{
    for(let  j=i+1;j<arr.length;j++)
    {
        //for descending
        if(arr[i]<arr[j])
        {
            let temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
console.log(arr)