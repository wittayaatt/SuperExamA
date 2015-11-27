package com.example

class ButterflyShape {
  def printButterfly(size: Int): Unit = {
    if(size%2!=0){
      println("Support only even number!!")
      return
    }
    println("-----------------------------------------------------------")
    var ext = size*2
    for (x <- 0 to ext) {
      for (y <- 0 to ext) {
        if(x==size && y==size){
          print("-");
        }else if(y==size){
          print(" ");
        }else if(x<size){
          if(y<size){
            if(y-x<0){
              print("+")
            }else{
              print(" ")
            }
          }else if(y>size){
            if(y+x>ext){
              print("+")
            }else{
              print(" ")
            }
          }
        }else if(x>size){
          if(y<size){
            if(ext-y>x){
              print("+")
            }else{
              print(" ")
            }
          }else if(y>size){
            if(y-x>0){
              print("+")
            }else{
              print(" ")
            }
          }
        }else{
          print("+");
        }
      }
      println()
    }
    println()
  }
}