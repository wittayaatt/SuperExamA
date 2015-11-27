package com.example

class DiamondShape() {
  def printDiamond(size: Int): Unit = {
    if(size%2==0){
      println("Support only odd number!!")
      return
    }
    println("-----------------------------------------------------------")
    var cen = (size+1)/2
    for (x <- 1 to size) {
      for (y <- 1 to size) {
        if(x<cen){
          if(y<cen-x+1 || y>cen+x-1){
            print(" ")
          }else{
            print("+")
          }
        }else if(x>cen){
          if(y>cen){
            if(y-x>0){
              print("+")
            }
          }else if(y<x-cen+1){
            print(" ")
          }else{
            print("+")
          }
        }else{
          print("+")
        }
      }
      println()
    }
    println()
  }
}
