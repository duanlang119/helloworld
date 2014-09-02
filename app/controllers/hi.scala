package controllers

/**
 * Created by eyaguox on 8/5/2014.
 */

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

object text extends App{
  val hiscala = ActorSystem()
  class HI extends Actor{
    def receive= {
      case msg:String => println("HI " + msg)
    }
  }
  def SHOW(m:String) = {
    val ACTORa = hiscala.actorOf(Props[HI])
    ACTORa ! m
    ACTORa ! m+" "+m
  }
  val scala=Array[String]("Scala","Actor","AKKA")
  for (i<- scala) SHOW(i)
  hiscala.shutdown
}
