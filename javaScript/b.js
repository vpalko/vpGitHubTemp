let c = {
	header: {
		source: "MBE",
		messageDateTime: "2024-04-25 16:08:41.000008",
		pepid: "",
	},
	recordInfo: {
		melactive: "Y",
		meleventTS: "2024-02-15 22:11:58.363587",
		msrstatus: "Advantage Plus application received",
		letterRequestId: "",
		eventType: "MP Workflow",
		triggerStatus: "",
		documentType: "",
		applicantType: "DPA",
		specialProductType: "",
		memberType: "",
		applicationId: "",
		eventName: "Enrollment - Supplemental Rider Maintenance",
	},
	memberInfo: {
		mbi: "7NJ2QH2KT49",
		mrn: "96569286",
		mrnprefix: "11",
		contractNumber: "H0524",
		region: "NCA",
		nameFirst: "MEIKAY",
		nameMI: "D",
		nameLast: "OUVUT",
		dob: "1958-06-15",
		programID: "M30",
		effectiveDate: "2024-03-01",
		memberAddress: [
			{
				addressLine1: "9990 Chilton Drive",
				addressLine2: "",
				city: "WALNUT CREEK",
				state: "CA",
				zip: "94596",
			},
		],
	},
	additionalInfo: {
		rfiReason1: "",
		rfiReason2: "",
		rfiReason3: "",
		rfiReason4: "",
		rfiResponseByDate: "",
		denialReason: "",
	},
}

function getPrivate(keys, maskChar, object) {
	const HIDDEN_VALUE = "****"
	const results = {}
	for (var key in object) {
		if (keys.includes(key)) {
			if (maskChar) {
				results[key] = mask(object[key], maskChar)
			} else {
				results[key] = HIDDEN_VALUE
			}
		} else if (typeof object[key] === "object" && object[key] !== null) {
			results[key] = getPrivate(keys, maskChar, object[key])
		} else {
			results[key] = object[key]
		}
	}
	return results
}

function mask(word, maskChar) {
	if (word.length <= 4) {
		return word
	} else {
		var masked =
			word.substring(0, word.length - 4).replace(/[a-z\d]/gi, maskChar) + word.substring(word.length - 4, word.length)
		return masked
	}
}

console.log(getPrivate(["mrn", "mbi", "ssn"], "*", c))
// console.log(getPrivate("mrn", 'x', c))
