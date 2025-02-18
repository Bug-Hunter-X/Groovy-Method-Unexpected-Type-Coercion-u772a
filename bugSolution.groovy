def myMethod(Integer a, Integer b){
  if(a>b){
    return a
  }else{
    return b
  }
}
println myMethod(10,5)
println myMethod(5,10)
println myMethod(10, "5") // this will throw an exception now, highlighting the issue