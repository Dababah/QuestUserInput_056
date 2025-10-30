package com.example.questuserinput_056

import androidx.compose.material3.HorizontalDivider
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource

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


    Column(modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally){
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),
            label = { Text(text = " Nama Lenkkap") },
            onValueChange = {
                textNama = it
            }
        )
        Row {
            gender.forEach { item ->

            }

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

    HorizontalDivider(
        modifier = Modifier.padding = dimensionResource(R.dimen.padding_medium) top = di
         = R.dimen.padding_medium
    )),
    thickness = dimensionResource(R.dimen.divider_tipis),
    color = color.darkgray)

    Button(
        modifier = Modifier.fillmaxwidth(1f),
        enabled = textAlamat.isNoEmpty(),
        onClick = {
            nama=textNama
            jenis=textJK
            alamat=textAlamat
        }
    )
    {
        Text(stringResource(R.string.submit)
    }}
        HorizontalDivider(
        modifier = Modifier.padding = dimensionResource(R.dimen.padding_medium) top = di
                = R.dimen.padding_medium
        )),
            thickness = dimensionResource(R.dimen.divider_tipis),
            color = color.darkgray)