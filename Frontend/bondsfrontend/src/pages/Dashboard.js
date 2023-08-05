import "./Dashboard.css"
import TradeData from '../JSONData1/Trade.json'
import BookData from '../JSONData1/Book.json'
import BookUserData from '../JSONData1/BookUser.json'
import CounterPartyData from '../JSONData1/CounterParty.json'
import SecurityData from '../JSONData1/Security.json'
import UserData from '../JSONData1/User.json'

// use for debugging
console.clear()
console.log("App Start")

let CurrentUserID = 1001
let CurrentUser = UserData.find(element => element.Id == CurrentUserID)

console.log(CurrentUser)

function GroupTradesByBook(){
   let Library = new Map()

   TradeData.forEach(element => {
      if(Library.has(element.BookId)){
         Library.get(element.BookId).push(element)
      }else{
         Library.set(element.BookId,[element])
      }
   })
   // returns a key value pair of (Book ID) => (List of Trades of that book)
   return Library
}

// function AssignSecuritiesToTrades(selectedBookID, Library){
//    let TradeList = Library.get()
//    let TradeDetails = new Map()
// }

console.log(GroupTradesByBook())

function Dashboard() {
   

   return (
      <>
         <div className="main">
            <div className="userdetails">
               <h2 id="usergreeting">Welcome, {CurrentUser.Name}!</h2>
               <h2 id="userid">{CurrentUser.Id}</h2>
               <h2 id="userrole">{CurrentUser.Role}</h2>
               <h2 id="useremail">{CurrentUser.Email}</h2>
               <img src="https://cdn-icons-png.flaticon.com/512/126/126467.png" width="40px"/>
            </div>
            <div className="bookselector">
               <h1>book selector</h1>
            </div>
            <div className="tradedetails">
               <div className="listoftrades">
                  <table class="table table-striped-columns">
                     <thead>
                        
                        <tr>
                           <th scope="col">Id</th>
                           <th scope="col">Book Id</th>
                           <th scope="col">Counter party Id</th>
                           <th scope="col">Security Id</th>
                           <th scope="col">Quantity</th>
                           <th scope="col">Status</th>
                           <th scope="col">Price</th>
                           <th scope="col">Buy_Sell</th>
                           <th scope="col">TradeDate</th>
                           <th scope="col">SettlementDate</th>
                        </tr>
                     </thead>
                     <tbody>
                        {/* <tr>
                           <th scope="row">1</th>
                           <td>Mark</td>
                           <td>Otto</td>
                           <td>@mdo</td>
                        </tr> */}
                        {TradeData.map((item) =>(
                           <tr>
                              <th scope="row">{item.Id}</th>
                              <td>{item.BookId}</td>
                              <td>{item.CounterpartyId}</td>
                              <td>{item.SecurityId}</td>
                              <td>{item.Quantity}</td>
                              <td>{item.Status}</td>
                              <td>{item.Price}</td>
                              <td>{item.Buy_Sell}</td>
                              <td>{item.TradeDate}</td>
                              <td>{item.SettlementDate}</td>

                           </tr>
                        ))}
                     </tbody>
                  </table>
               </div>
               <div className="selectedtradedetails">
               </div>
            </div>
         </div>
      </>
   )
}
export default Dashboard