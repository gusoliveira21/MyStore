package com.gusoliveira.mystore.util.formatCurrency

class Format {
    companion object {
        fun formatCurrency(value: Double): String {
            val formattedValue = String.format("%.2f", value).replace(".", ",")
            return "R$ $formattedValue"
        }
        fun parseCurrency(valueString: String): Double {
            val cleanValueString = valueString.replace("[R$,]".toRegex(), "")
            return cleanValueString.toDouble()
        }
    }
}