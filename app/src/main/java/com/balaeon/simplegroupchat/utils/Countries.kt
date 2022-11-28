package com.balaeon.simplegroupchat.utils

import com.balaeon.simplegroupchat.models.Country

object Countries {

    private val COUNTRIES= arrayOf(
        Country("AF", "Afghanistan", "+93", "AFN"),
        Country("AX", "Aland Islands", "+358", "EUR"),
        Country("AL", "Albania", "+355", "ALL"),
        Country("DZ", "Algeria", "+213", "DZD"),
        Country("AS", "American Samoa", "+1", "USD"),
        Country("AD", "Andorra", "+376", "EUR"),
        Country("AO", "Angola", "+244", "AOA"),
        Country("AI", "Anguilla", "+1", "XCD"),
        Country("AQ", "Antarctica", "+672", "USD"),
        Country("AG", "Antigua and Barbuda", "+1", "XCD"),
        Country("AR", "Argentina", "+54", "ARS"),
        Country("AM", "Armenia", "+374", "AMD"),
        Country("AW", "Aruba", "+297", "AWG"),
        Country("AU", "Australia", "+61", "AUD"),
        Country("AT", "Austria", "+43", "EUR"),
        Country("AZ", "Azerbaijan", "+994", "AZN"),
        Country("BS", "Bahamas", "+1", "BSD"),
        Country("BH", "Bahrain", "+973", "BHD"),
        Country("BD", "Bangladesh", "+880", "BDT"),
        Country("BB", "Barbados", "+1", "BBD"),
        Country("BY", "Belarus", "+375", "BYR"),
        Country("BE", "Belgium", "+32", "EUR"),
        Country("BZ", "Belize", "+501", "BZD"),
        Country("BJ", "Benin", "+229", "XOF"),
        Country("BM", "Bermuda", "+1", "BMD"),
        Country("BT", "Bhutan", "+975", "BTN"),
        Country("BO", "Bolivia, Plurinational State of", "+591", "BOB"),
        Country("BA", "Bosnia and Herzegovina", "+387", "BAM"),
        Country("BQ", "Bonaire", "+599", "USD"),
        Country("BW", "Botswana", "+267", "BWP"),
        Country("BV", "Bouvet Island", "+47", "NOK"),
        Country("BR", "Brazil", "+55", "BRL"),
        Country("IO", "British Indian Ocean Territory", "+246", "USD"),
        Country("BN", "Brunei Darussalam", "+673", "BND"),
        Country("BG", "Bulgaria", "+359", "BGN"),
        Country("BF", "Burkina Faso", "+226", "XOF"),
        Country("BI", "Burundi", "+257", "BIF"),
        Country("KH", "Cambodia", "+855", "KHR"),
        Country("CM", "Cameroon", "+237", "XAF"),
        Country("CA", "Canada", "+1", "CAD"),
        Country("CV", "Cape Verde", "+238", "CVE"),
        Country("KY", "Cayman Islands", "+345", "KYD"),
        Country("CF", "Central African Republic", "+236", "XAF"),
        Country("TD", "Chad", "+235", "XAF"),
        Country("CL", "Chile", "+56", "CLP"),
        Country("CN", "China", "+86", "CNY"),
        Country("CX", "Christmas Island", "+61", "AUD"),
        Country("CC", "Cocos (Keeling) Islands", "+61", "AUD"),
        Country("CO", "Colombia", "+57", "COP"),
        Country("KM", "Comoros", "+269", "KMF"),
        Country("CD", "Congo, The Democratic Republic of the", "+243", "CDF"),
        Country("CG", "Congo", "+242", "XAF"),
        Country("CK", "Cook Islands", "+682", "NZD"),
        Country("CR", "Costa Rica", "+506", "CRC"),
        Country("HR", "Croatia", "+385", "HRK"),
        Country("CU", "Cuba", "+53", "CUP"),
        Country("CW", "Curacao", "+599", "ANG"),
        Country("CY", "Cyprus", "+357", "EUR"),
        Country("CZ", "Czech Republic", "+420", "CZK"),
        Country("DK", "Denmark", "+45", "DKK"),
        Country("DJ", "Djibouti", "+253", "DJF"),
        Country("DM", "Dominica", "+1", "XCD"),
        Country("DO", "Dominican Republic", "+1", "DOP"),
        Country("TL", "East Timor", "+670", "USD"),
        Country("EC", "Ecuador", "+593", "USD"),
        Country("EG", "Egypt", "+20", "EGP"),
        Country("SV", "El Salvador", "+503", "SVC"),
        Country("GQ", "Equatorial Guinea", "+240", "XAF"),
        Country("ER", "Eritrea", "+291", "ERN"),
        Country("EE", "Estonia", "+372", "EUR"),
        Country("ET", "Ethiopia", "+251", "ETB"),
        Country("FK", "Falkland Islands (Malvinas)", "+500", "FKP"),
        Country("FO", "Faroe Islands", "+298", "DKK"),
        Country("FJ", "Fiji", "+679", "FJD"),
        Country("FI", "Finland", "+358", "EUR"),
        Country("FR", "France", "+33", "EUR"),
        Country("GF", "French Guiana", "+594", "EUR"),
        Country("TF", "French Southern Territories", "+262", "EUR"),
        Country("PF", "French Polynesia", "+689", "XPF"),
        Country("GA", "Gabon", "+241", "XAF"),
        Country("GM", "Gambia", "+220", "GMD"),
        Country("GE", "Georgia", "+995", "GEL"),
        Country("DE", "Germany", "+49", "EUR"),
        Country("GH", "Ghana", "+233", "GHS"),
        Country("GI", "Gibraltar", "+350", "GIP"),
        Country("GR", "Greece", "+30", "EUR"),
        Country("GL", "Greenland", "+299", "DKK"),
        Country("GD", "Grenada", "+1", "XCD"),
        Country("GP", "Guadeloupe", "+590", "EUR"),
        Country("GU", "Guam", "+1", "USD"),
        Country("GT", "Guatemala", "+502", "GTQ"),
        Country("GG", "Guernsey", "+44", "GGP"),
        Country("GN", "Guinea", "+224", "GNF"),
        Country("GW", "Guinea-Bissau", "+245", "XOF"),
        Country("GY", "Guyana", "+595", "GYD"),
        Country("HT", "Haiti", "+509", "HTG"),
        Country("HM", "Heard Island and McDonald Islands", "+000", "AUD"),
        Country("VA", "Holy See (Vatican City State)", "+379", "EUR"),
        Country("HN", "Honduras", "+504", "HNL"),
        Country("HK", "Hong Kong", "+852", "HKD"),
        Country("HU", "Hungary", "+36", "HUF"),
        Country("IS", "Iceland", "+354", "ISK"),
        Utils.getDefaultCountry(),
        Country("ID", "Indonesia", "+62", "IDR"),
        Country("IR", "Iran, Islamic Republic of", "+98", "IRR"),
        Country("IQ", "Iraq", "+964", "IQD"),
        Country("IE", "Ireland", "+353", "EUR"),
        Country("IM", "Isle of Man", "+44", "GBP"),
        Country("IL", "Israel", "+972", "ILS"),
        Country("IT", "Italy", "+39", "EUR"),
        Country("CI", "Ivory Coast", "+225", "XOF"),
        Country("JM", "Jamaica", "+1", "JMD"),
        Country("JP", "Japan", "+81", "JPY"),
        Country("JE", "Jersey", "+44", "JEP"),
        Country("JO", "Jordan", "+962", "JOD"),
        Country("KZ", "Kazakhstan", "+7", "KZT"),
        Country("KE", "Kenya", "+254", "KES"),
        Country("KI", "Kiribati", "+686", "AUD"),
        Country("XK", "Kosovo", "+383", "EUR"),
        Country("KW", "Kuwait", "+965", "KWD"),
        Country("KG", "Kyrgyzstan", "+996", "KGS"),
        Country("LA", "Lao People's Democratic Republic", "+856", "LAK"),
        Country("LV", "Latvia", "+371", "LVL"),
        Country("LB", "Lebanon", "+961", "LBP"),
        Country("LS", "Lesotho", "+266", "LSL"),
        Country("LR", "Liberia", "+231", "LRD"),
        Country("LY", "Libyan Arab Jamahiriya", "+218", "LYD"),
        Country("LI", "Liechtenstein", "+423", "CHF"),
        Country("LT", "Lithuania", "+370", "LTL"),
        Country("LU", "Luxembourg", "+352", "EUR"),
        Country("MO", "Macao", "+853", "MOP"),
        Country(
            "MK", "Macedonia, The Former Yugoslav Republic of", "+389",
            "MKD"
        ),
        Country("MG", "Madagascar", "+261", "MGA"),
        Country("MW", "Malawi", "+265", "MWK"),
        Country("MY", "Malaysia", "+60", "MYR"),
        Country("MV", "Maldives", "+960", "MVR"),
        Country("ML", "Mali", "+223", "XOF"),
        Country("MT", "Malta", "+356", "EUR"),
        Country("MH", "Marshall Islands", "+692", "USD"),
        Country("MQ", "Martinique", "+596", "EUR"),
        Country("MR", "Mauritania", "+222", "MRO"),
        Country("MU", "Mauritius", "+230", "MUR"),
        Country("YT", "Mayotte", "+262", "EUR"),
        Country("MX", "Mexico", "+52", "MXN"),
        Country("FM", "Micronesia, Federated States of", "+691", "USD"),
        Country("MD", "Moldova, Republic of", "+373", "MDL"),
        Country("MC", "Monaco", "+377", "EUR"),
        Country("MN", "Mongolia", "+976", "MNT"),
        Country("ME", "Montenegro", "+382", "EUR"),
        Country("MS", "Montserrat", "+1", "XCD"),
        Country("MA", "Morocco", "+212", "MAD"),
        Country("MZ", "Mozambique", "+258", "MZN"),
        Country("MM", "Myanmar", "+95", "MMK"),
        Country("NA", "Namibia", "+264", "NAD"),
        Country("NR", "Nauru", "+674", "AUD"),
        Country("NP", "Nepal", "+977", "NPR"),
        Country("NL", "Netherlands", "+31", "EUR"),
        Country("NC", "New Caledonia", "+687", "XPF"),
        Country("NZ", "New Zealand", "+64", "NZD"),
        Country("NI", "Nicaragua", "+505", "NIO"),
        Country("NE", "Niger", "+227", "XOF"),
        Country("NG", "Nigeria", "+234", "NGN"),
        Country("NU", "Niue", "+683", "NZD"),
        Country("NF", "Norfolk Island", "+672", "AUD"),
        Country("MP", "Northern Mariana Islands", "+1", "USD"),
        Country("KP", "North Korea", "+850", "KPW"),
        Country("NO", "Norway", "+47", "NOK"),
        Country("OM", "Oman", "+968", "OMR"),
        Country("PK", "Pakistan", "+92", "PKR"),
        Country("PW", "Palau", "+680", "USD"),
        Country("PS", "Palestinian Territory, Occupied", "+970", "ILS"),
        Country("PA", "Panama", "+507", "PAB"),
        Country("PG", "Papua New Guinea", "+675", "PGK"),
        Country("PY", "Paraguay", "+595", "PYG"),
        Country("PE", "Peru", "+51", "PEN"),
        Country("PH", "Philippines", "+63", "PHP"),
        Country("PN", "Pitcairn", "+872", "NZD"),
        Country("PL", "Poland", "+48", "PLN"),
        Country("PT", "Portugal", "+351", "EUR"),
        Country("PR", "Puerto Rico", "+1", "USD"),
        Country("QA", "Qatar", "+974", "QAR"),
        Country("RO", "Romania", "+40", "RON"),
        Country("RU", "Russia", "+7", "RUB"),
        Country("RW", "Rwanda", "+250", "RWF"),
        Country("RE", "Reunion", "+262", "EUR"),
        Country("BL", "Saint Barthelemy", "+590", "EUR"),
        Country(
            "SH", "Saint Helena, Ascension and Tristan Da Cunha", "+290",
            "SHP"
        ),
        Country("KN", "Saint Kitts and Nevis", "+1", "XCD"),
        Country("LC", "Saint Lucia", "+1", "XCD"),
        Country("MF", "Saint Martin", "+590", "EUR"),
        Country("PM", "Saint Pierre and Miquelon", "+508", "EUR"),
        Country("VC", "Saint Vincent and the Grenadines", "+1", "XCD"),
        Country("WS", "Samoa", "+685", "WST"),
        Country("SM", "San Marino", "+378", "EUR"),
        Country("ST", "Sao Tome and Principe", "+239", "STD"),
        Country("SA", "Saudi Arabia", "+966", "SAR"),
        Country("SN", "Senegal", "+221", "XOF"),
        Country("RS", "Serbia", "+381", "RSD"),
        Country("SC", "Seychelles", "+248", "SCR"),
        Country("SL", "Sierra Leone", "+232", "SLL"),
        Country("SG", "Singapore", "+65", "SGD"),
        Country("SX", "Sint Maarten", "+1", "ANG"),
        Country("SK", "Slovakia", "+421", "EUR"),
        Country("SI", "Slovenia", "+386", "EUR"),
        Country("SB", "Solomon Islands", "+677", "SBD"),
        Country("SO", "Somalia", "+252", "SOS"),
        Country("ZA", "South Africa", "+27", "ZAR"),
        Country("SS", "South Sudan", "+211", "SSP"),
        Country(
            "GS", "South Georgia and the South Sandwich Islands", "+500",
            "GBP"
        ),
        Country("KR", "South Korea", "+82", "KRW"),
        Country("ES", "Spain", "+34", "EUR"),
        Country("LK", "Sri Lanka", "+94", "LKR"),
        Country("SD", "Sudan", "+249", "SDG"),
        Country("SR", "Suriname", "+597", "SRD"),
        Country("SJ", "Svalbard and Jan Mayen", "+47", "NOK"),
        Country("SZ", "Swaziland", "+268", "SZL"),
        Country("SE", "Sweden", "+46", "SEK"),
        Country("CH", "Switzerland", "+41", "CHF"),
        Country("SY", "Syrian Arab Republic", "+963", "SYP"),
        Country("TW", "Taiwan", "+886", "TWD"),
        Country("TJ", "Tajikistan", "+992", "TJS"),
        Country("TZ", "Tanzania, United Republic of", "+255", "TZS"),
        Country("TH", "Thailand", "+66", "THB"),
        Country("TG", "Togo", "+228", "XOF"),
        Country("TK", "Tokelau", "+690", "NZD"),
        Country("TO", "Tonga", "+676", "TOP"),
        Country("TT", "Trinidad and Tobago", "+1", "TTD"),
        Country("TN", "Tunisia", "+216", "TND"),
        Country("TR", "Turkey", "+90", "TRY"),
        Country("TM", "Turkmenistan", "+993", "TMT"),
        Country("TC", "Turks and Caicos Islands", "+1", "USD"),
        Country("TV", "Tuvalu", "+688", "AUD"),
        Country("UM", "U.S. Minor Outlying Islands", "+1", "USD"),
        Country("UG", "Uganda", "+256", "UGX"),
        Country("UA", "Ukraine", "+380", "UAH"),
        Country("AE", "United Arab Emirates", "+971", "AED"),
        Country("GB", "United Kingdom", "+44", "GBP"),
        Country("US", "United States", "+1", "USD"),
        Country("UY", "Uruguay", "+598", "UYU"),
        Country("UZ", "Uzbekistan", "+998", "UZS"),
        Country("VU", "Vanuatu", "+678", "VUV"),
        Country("VE", "Venezuela, Bolivarian Republic of", "+58", "VEF"),
        Country("VN", "Vietnam", "+84", "VND"),
        Country("VG", "Virgin Islands, British", "+1", "USD"),
        Country("VI", "Virgin Islands, U.S.", "+1", "USD"),
        Country("WF", "Wallis and Futuna", "+681", "XPF"),
        Country("EH", "Western Sahara", "+212", "MAD"),
        Country("YE", "Yemen", "+967", "YER"),
        Country("ZM", "Zambia", "+260", "ZMW"),
        Country("ZW", "Zimbabwe", "+263", "USD")
    )

    fun getCountries(): List<Country>{
        return COUNTRIES.toList()
    }
}