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
        "Issuer": "ReserveBankofIndia",
        "MaturityDate": 20230802,
        "Coupon": "CPNCD001",
        "Type": "GOVT",
        "FaceValue": 100,
        "Status": 1 //matured 1 else 0
    },
    {
        "Id": 1002,
        "ISIN": "US123456A78C",
        "CUSIP": 123456122,
        "Issuer": "Morgan Stanley",
        "MaturityDate": 20230812,
        "Coupon": "CPNCD002",
        "Type": "CORP",
        "FaceValue": 150,
        "Status": 0 //matured 1 else 0
    },
    {
        "Id": 1003,
        "ISIN": "US123456A78D",
        "CUSIP": 123456123,
        "Issuer": "BankOfAmerica",
        "MaturityDate": 20230612,
        "Coupon": "CPNCD003",
        "Type": "GOVT",
        "FaceValue": 75,
        "Status": 1 //matured 1 else 0
    },
    {
        "Id": 1004,
        "ISIN": "UK123456A78E",
        "CUSIP": 123456124,
        "Issuer": "Barclays",
        "MaturityDate": 20230724,
        "Coupon": "CPNCD004",
        "Type": "CORP",
        "FaceValue": 80,
        "Status": 1 //matured 1 else 0
    }
]