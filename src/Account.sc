object account {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var acct = new BankAccount                      //> acct  : BankAccount = BankAccount@6e1567f1
  acct deposit 0                                  //> chindi saale
                                                  //| res0: Int = 0
  acct deposit(550)                               //> res1: Int = 550
  acct deposit 500                                //> res2: Int = 1050
  acct withdraw 400                               //> res3: Int = 650
  
  
  
  
	}