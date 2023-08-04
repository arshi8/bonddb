let Books = [
    {
        "Id":1234,
        "BookName":"XYZ"

    },
]

let User = [
    {
        "Id":9876,
        "Name":"User1",
        "Email":"User1@domain.com",
        "Role": "Admin"
    },
    {
        "Id":8765,
        "Name":"User2",
        "Email":"User2@domain.com",
        "Role": "Admin"
    },
    {
        "Id":7654,
        "Name":"User3",
        "Email":"User3@domain.com",
        "Role": "Admin"
    }
]

let BookUser = [
    {
        "BookId":1234,
        "UserId":9876
    },
    {
        "BookId":1234,
        "UserId":8765
    },
    {
        "BookId":1234,
        "UserId":7654
    }
]

let CounterParty = [
    {
        "Id": 1001,
        "Name": "Google Cloud"
    },
    {
        "Id": 1002,
        "Name": "Microsoft Azure"
    },
    {
        "Id": 1003,
        "Name": "Amazon Web Services"
    }
]

let Security = [
    {
        "Id": 1001,
        "ISIN": "IN123456A78B",
        "CUSIP": 123456121,
        "Issuer": "Reserve Bank Of India",
        "MaturityDate": "2023-08-02",
        "Coupon": "CPNCD001",
        "Type": "GOVT",
        "FaceValue": 100,
        "Status": "Matured"
    },
    {
        "Id": 1002,
        "ISIN": "US123456A78C",
        "CUSIP": 123456122,
        "Issuer": "Morgan Stanley",
        "MaturityDate": "2023-08-12",
        "Coupon": "CPNCD002",
        "Type": "CORP",
        "FaceValue": 150,
        "Status": "Not-Matured"
    },
    {
        "Id": 1003,
        "ISIN": "US123456A78D",
        "CUSIP": 123456123,
        "Issuer": "Bank Of America",
        "MaturityDate": "2023-06-12",
        "Coupon": "CPNCD003",
        "Type": "GOVT",
        "FaceValue": 75,
        "Status": "Matured"
    },
    {
        "Id": 1004,
        "ISIN": "UK123456A78E",
        "CUSIP": 123456124,
        "Issuer": "Barclays",
        "MaturityDate": "2023-07-24",
        "Coupon": "CPNCD004",
        "Type": "CORP",
        "FaceValue": 80,
        "Status": "Matured"
    }
]

let Trade = [
    {
        "Id":1,
        "BookId": 1,
        "CounterpartyId": 1,
        "SecurityId": 1,
        "Quantity": 10,
        "Status": "Settled",
        "Price": 200,
        "Buy_Sell": "Buy",
        "TradeDate": "2021-01-01",
        "SettlementDate": "2023-06-01" 
    },
    {
        "Id": 2,
        "BookId": 2,
        "CounterpartyId": 2,
        "SecurityId": 2,
        "Quantity": 35,
        "Status": "Not-Settled",
        "Price": 150,
        "Buy_Sell": "Sell",
        "TradeDate": "2023-04-20",
        "SettlementDate": "2023-12-20" 
    },
    {
        "Id": 3,
        "BookId": 3,
        "CounterpartyId": 3,
        "SecurityId": 3,
        "Quantity": 25,
        "Status": "Settled",
        "Price": 100,
        "Buy_Sell": "Buy",
        "TradeDate": "2020-10-30",
        "SettlementDate": "2022-10-30" 
    },
    {
        "Id": 4,
        "BookId": 4,
        "CounterpartyId": 4,
        "SecurityId": 4,
        "Quantity": 50,
        "Status": "Settled",
        "Price": 75,
        "Buy_Sell": "Sell",
        "TradeDate": "2022-05-25",
        "SettlementDate": "2023-03-10" 
    },
    {
        "Id": 5,
        "BookId": 5,
        "CounterpartyId": 5,
        "SecurityId": 5,
        "Quantity": 60,
        "Status": "Not-Settled",
        "Price": 150,
        "Buy_Sell": "Buy",
        "TradeDate": "2020-12-15",
        "SettlementDate": "2024-12-15" 
    }
]