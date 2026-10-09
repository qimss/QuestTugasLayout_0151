package com.example.assigmentlayoutapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainDashboard(modifier : Modifier = Modifier){
    Box(modifier = Modifier.fillMaxSize())
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))
        CardMhs(
            Nama = stringResource(R.string.nama_dosen),
            UkuranFontNama = 22.sp,
            Alamat = stringResource(R.string.alamat_dosen),
            WarnaKartu = colorResource(R.color.card_dosen),
            WarnaAlamat = colorResource(R.color.warna_alamat),
            FontNama = FontFamily.Cursive,
            FontWeightNama = FontWeight.Normal
        )

        CardMhs(
            Nama = stringResource(R.string.nama_mhs1),
            Alamat = stringResource(R.string.alamat_mhs1),
            WarnaKartu = colorResource(R.color.card_mhs1),
            WarnaAlamat = colorResource(R.color.warna_alamat),
            Telepon = stringResource(R.string.nohp_mhs1),
            WarnaTelepon = colorResource(R.color.warna_nohp)
        )

        CardMhs(
            Nama = stringResource(R.string.nama_mhs2),
            Alamat = stringResource(R.string.alamat_mhs2),
            WarnaKartu = colorResource(R.color.card_mhs2),
            WarnaAlamat = colorResource(R.color.white),
            Telepon = stringResource(R.string.nohp_mhs2),
            WarnaTelepon = colorResource(R.color.warna_nohp)
        )

        CardMhs(
            Nama = stringResource(R.string.nama_mhs3),
            Alamat = stringResource(R.string.alamat_mhs3),
            WarnaKartu = colorResource(R.color.card_mhs3),
            WarnaAlamat = colorResource(R.color.white),
            Telepon = stringResource(R.string.nohp_mhs3),
            WarnaTelepon = colorResource(R.color.warna_nohp)
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = stringResource(R.string.copy),
                fontSize = 12.sp,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 36.dp)
            )
        }
    }

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
                modifier = Modifier.size(90.dp)
            )
            Column(
                modifier= Modifier.weight(1f).padding(horizontal = 16.dp)
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
                modifier = Modifier.size(90.dp)
            )
        }
    }
}