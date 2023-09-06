let name = prompt("Inter your name")
let slice=name.slice(0,1);
let capital = slice.toUpperCase()
restname =name.slice(1,name.length)
restname=restname.toLowerCase()
concat=capital+restname;
alert( "Hello " +concat)