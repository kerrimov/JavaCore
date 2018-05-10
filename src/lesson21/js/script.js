function delay(logic,timeout){
    return new Promise(function(resolve,reject){
        if (timeout > 4000){
            reject();
        }
        else{
            SetTimeOut(resolve, timeout)
        }
});
}

let promise = delay(5000)
promise.then(function(){
    console.log("Success")
}, function(){
    console.log("Fail")
});