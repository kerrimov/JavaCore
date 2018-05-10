var element = document.getElementById("cat");
if (element){
    element.addEventListener('mouseover', function(){
        this.style.width = '110%';

    },false);
element.addEventListener('mouseout', function(){
    this.style.width = '100%';
},false);
}
var login = document.getElementById("login");
if (login){
    login.addEventListener('mouseover', function(){
        this.style.color = 'red';
        //this.style.padding: 2px;
    },false);

    login.addEventListener('mouseout', function(){
        this.style.color = 'blue';
    },false);
}

var valid = document.getElementById("firstName");
if(valid){
    document.getElementById("button").onclick = function(e){
    console.log (e);
    e.preventDefault();
    document.getElementById("name").innerHTML = null;

        if(valid.value.length < 4 ){
            document.getElementById("name").innerHTML +="Space or small size";
            return false;
        }
        else {
            window.location.href = "test3.html";
           return true;
        }
    }
}
/*
function hide(temp) {
    if(document.getElementById(temp).style.display == "none"){
        document.getElementById(temp).style.display = "block";
    } else{
        document.getElementById(temp).style.display ="none";
    }
}
/*function down(a)
{
  console.log(a);
  var a = document.getElementById('dropdown');
  if ( a.style.display == 'none' )
    a.style.display = 'block'
  else
    if ( a.style.display == 'block' )
    a.style.display = 'none';
}*/