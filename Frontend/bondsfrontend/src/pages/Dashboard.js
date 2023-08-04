import "./Dashboard.css"
import JSONData from '../JSONData1/Trade.json'
function Dashboard() {
   return (
      <>
         <div className="main">
            <div className="bookanduserdetails">
               <h1>User details</h1>
            </div>
            <div className="bookanduserdetails">
               <h1>Selected books</h1>
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
                        {JSONData.map((item) =>(
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