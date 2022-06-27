package add

import scala.collection.mutable.ArrayBuffer


case class IndividualsDetail(name: String, surname: String, contacts: List[ContactDetails])
//{
//
//  require(name.nonEmpty || surname.nonEmpty)
//}

case class ContactDetails(phoneNumber: String, email: String, address: String)


class Authenticator {
//
//  def contactAuthenticator(subscriber: IndividualsDetail): String = { //ask mazin
//    subscriber match {
//      case subscriber if subscriber.contacts.forall(x=> x.email.isEmpty) => "Missing email"
//      case subscriber if subscriber.contacts.forall(x=> x.phoneNumber.isEmpty) => "Missing phoneNumber"
//      case subscriber if subscriber.contacts.forall(x=> x.address.isEmpty) => "Missing address"
//      case subscriber if subscriber.name.isEmpty => "Missing name"
//      case subscriber if subscriber.surname.isEmpty => "Missing surname"
//      case _ => "We have received all the necessary information"
//    }
//  }
  def validateSubscriber(subscriber: IndividualsDetail): Unit = { //ask mazin
    if (subscriber.name.isEmpty) throw new RuntimeException("Missing name")
    if (subscriber.surname.isEmpty) throw new RuntimeException("Missing surname")

    subscriber.contacts.foreach(c => if (c.email.isEmpty) throw new RuntimeException("Missing email") )
    subscriber.contacts.foreach(c => if (c.phoneNumber.isEmpty) throw new RuntimeException("Missing phoneNumber") )
    subscriber.contacts.foreach(c => if (c.address.isEmpty) throw new RuntimeException("Missing address") )
  }


}