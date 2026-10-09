package com.example.assigmentlayoutapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainDashboard(modifier : Modifier = Modifier){

}

@Composable
fun CardMhs(
    Nama : String,
    UkuranFontNama: TextUnit = 20.sp,
    Alamat : String,
    WarnaKartu: Color,
    WarnaAlamat: Color,
    modifier: Modifier = Modifier,
    Telepon: String? = null,
    WarnaTelepon: Color? = null,
    FontNama: FontFamily? = null,
    FontWeightNama: FontWeight = FontWeight.Bold,
    ){
    Card(
        modifier =  modifier
        .fillMaxWidth()
        .padding(12.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(WarnaKartu)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painterResource(R.drawable.umy),
                contentDescription = null,
                modifier = Modifier.size(70.dp).padding(5.dp)
            )
            Column(
                modifier= Modifier.weight(1f).padding(horizontal = 12.dp)
            ){
                Text(
                    text = Nama,
                    fontSize = UkuranFontNama,
                    fontFamily = FontNama,
                    fontWeight = FontWeightNama,
                    color = colorResource(R.color.white)
                )
                if (Telepon != null){
                    Text(
                        text = Telepon,
                        fontSize = 14.sp,
                        color = WarnaTelepon ?: colorResource(R.color.black)
                        )
                }
                Text(
                    text = Alamat,
                    fontSize = 14.sp,
                    color = WarnaAlamat
                )
            }
            Image(
                painterResource(R.drawable.umy),
                contentDescription = null,
                modifier = Modifier.size(70.dp).padding(5.dp)
            )
        }
    }
}