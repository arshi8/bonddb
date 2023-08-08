import "./Dashboard.css"
import TradeData from '../JSONData1/Trade.json'
import BookData from '../JSONData1/Book.json'
// import BookUserData from '../JSONData1/BookUser.json'
// import CounterPartyData from '../JSONData1/CounterParty.json'
// import SecurityData from '../JSONData1/Security.json'
import UserData from '../JSONData1/User.json'
import { useState } from "react"

// use for debugging
console.clear()
console.log("App Start")

let CurrentUserID = 1001
let CurrentUser = UserData.find(element => element.Id == CurrentUserID)

console.log(CurrentUser)

function GroupTradesByBook() {
   let Library = new Map()

   TradeData.forEach(element => {
      if (Library.has(element.BookId)) {
         Library.get(element.BookId).push(element)
      } else {
         Library.set(element.BookId, [element])
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
   const [isOpen, setIsOpen] = useState(false);
   const [currentBookId, setCurrentBookID] = useState(0);
   const [error, setError] = useState('');

   const toggleDropdown = () => {
      setIsOpen(!isOpen);
   };

   function handledropdown(option) {
      setCurrentBookID(option);
      // console.log(option);

   }
   const [selectedFromDate, setSelectedFromDate] = useState('');

   const handleFromDateChange = (event) => {
      setSelectedFromDate(event.target.value);
      setError('');
   };
   const [selectedToDate, setSelectedToDate] = useState('');

   const handleToDateChange = (event) => {
      setSelectedToDate(event.target.value);
      // setError('');
   };

   const validateDateRange = () => {
      if (selectedFromDate && selectedToDate) {
        if (new Date(selectedToDate) < new Date(selectedFromDate)) {
          setError('To date must be greater than from date');
        } else {
         //  setError('');
        }
      }
    };


   return (
      <>
         <div className="main">
            <div className="userdetails">
               <h2 id="usergreeting">Welcome, {CurrentUser.Name}!</h2>
               <h2 id="userid">{CurrentUser.Id}</h2>
               <h2 id="userrole">{CurrentUser.Role}</h2>
               <h2 id="useremail">{CurrentUser.Email}</h2>
               <img src="https://cdn-icons-png.flaticon.com/512/126/126467.png" width="40px" />
            </div>
            <div className="bookselector">
               {/* <h1>book selector</h1> */}
               <div className={`dropdown ${isOpen ? 'show' : ''} `}>
                  <button className="btn btn-secondary dropdown-toggle drpdownwdt" type="button" data-toggle="dropdown" onClick={toggleDropdown}>
                     {/* Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. */}
                     Lorem Ipsum
                  </button>
                  <ul className={`dropdown-menu ${isOpen ? 'show' : ''}`}>
                     {/* <ul className={`dropdown-menu`}> */}

                     {BookData.map((item) => (
                        <li key={item.Id}><div className="dropdown-item" onClick={() => handledropdown(item.Id)}>{item.BookName}</div></li>
                     ))}
                  </ul>
               </div>
               <div className="dateselectors">
                  {/* <div className="container mt-5"> */}
                  {/* <h2>Date Selector using Bootstrap</h2> */}

                  <div className="form-group">
                     <label>From:</label>
                     <input
                        type="date"
                        className="form-control"
                        value={selectedFromDate}
                        onChange={handleFromDateChange}
                        onBlur={validateDateRange}
                     />
                  </div>
                  <div className="form-group">
                     <label>To:</label>
                     <input
                        type="date"
                        className="form-control"
                        value={selectedToDate}
                        onChange={handleToDateChange}
                        onBlur={validateDateRange}
                     />
                  </div>
                  {error && <p className="text-danger">{error}</p>}
                  {/* <p>Selected Date: {selectedDate}</p> */}
                  {/* </div> */}
               </div>
            </div>
            <div className="tradedetails">
               <div className="listoftrades">
                  <table className="table table-striped-columns">
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
                        {TradeData.map((item) => (
                           currentBookId === 0 || currentBookId === item.BookId ? (
                              <tr key={item.Id}>
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
                           ) : null
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