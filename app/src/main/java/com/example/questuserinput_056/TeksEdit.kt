package com.example.questuserinput_056

@Composable
fun FormDataDiri(modifier: Modifier
){
    // variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf(" ") }
    var textJK by remember { mutableStateOf("") }

    // variabel-variabel untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf(" ") }
    var jenis by remember { mutableStateOf("") }

    val gender:List<String> = listOf("Laki-laki","Perempuan")

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
