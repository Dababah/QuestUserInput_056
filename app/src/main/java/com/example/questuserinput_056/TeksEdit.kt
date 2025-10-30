package com.example.questuserinput_056

Row {
    gender.forEach { item ->
        Row (modifier = Modifier.selectable(
            selected = textJk == item,
            onClick = { textJk = item}
        ), verticalAlignment = Alignment.CenterVertically){
            RadioButton(
                selected = textJk == item,
                onClick = {
                    textJk = item
                })
            Text(item)
        }
    }
}
OutlinedTextField(
value = textAlamat,
singleLine = true,
modifier = Modifier.width(250.dp),
label = {Text(text = "Alamat Lengkap")},
onValueChange = {
    textAlamat = it
