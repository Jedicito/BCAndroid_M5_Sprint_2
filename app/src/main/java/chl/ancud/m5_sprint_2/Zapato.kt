package chl.ancud.m5_sprint_2

data class Zapato(val nombre: String, val foto: String, val precio: Double)

class ListadoZapatos {
    companion object {
        val zapatos = mutableListOf<Zapato>().apply {
            add(Zapato("adidas Samba", "https://media.revistagq.com/photos/6389bf40cae20edc7f519ca4/master/w_1920%2Cc_limit/adidas-samba-blancas.jpg", 99.99))
            add(Zapato("Nike Zoom Vomero 5", "https://media.revistagq.com/photos/6384938bcc4d656ec28413cc/master/w_1920%2Cc_limit/1_nike-zoom-vomero-5-photon-dust.jpeg", 79.99))
            add(Zapato("New Balance 1600", "https://media.revistagq.com/photos/637605c19749ffe8a917fa87/master/w_1920%2Cc_limit/0new-balance-1600-ivory.jpeg", 149.99))
            add(Zapato("NikeCraft General Purpose", "https://media.revistagq.com/photos/6313012e22595362b0c1df73/master/w_1920%2Cc_limit/TS_GPS_Sulpher_Pair_original.jpg", 129.99))
            add(Zapato("adidas Yeezy Boost 350 V2", "https://media.revistagq.com/photos/6313017122595362b0c1df75/master/w_1920%2Cc_limit/adidas-yeezy-boost-350-v2-slate-0.jpg", 109.99))
            add(Zapato("Nike Zoom Cortez x sacai", "https://media.revistagq.com/photos/6313035442bb0fbbf38467fe/master/w_1920%2Cc_limit/DQ0581-100_274327722_D_A_1X1_110767.PNG", 89.99))
            add(Zapato("adidas 4DFWD", "https://media.revistagq.com/photos/63048e6c87b02a80718144d6/master/w_1920%2Cc_limit/adidas%25204DFWD.jpg", 199.99))
            add(Zapato("Nike Air Max 1 de Patta", "https://media.revistagq.com/photos/63130403b36065490c7c5d19/master/w_1920%2Cc_limit/patta-nike-air-max-1-zapatillas-blancas.jpeg", 169.99))
            add(Zapato("Air Jordan 4", "https://media.revistagq.com/photos/631301f38d626ab3d91614f8/master/w_1920%2Cc_limit/air-jordan-4.jpeg", 119.99))
            add(Zapato("Air Jordan 1 College", "https://media.revistagq.com/photos/6220dae023b7738d21d91e5c/master/w_1920%2Cc_limit/air-jordan-1-high-85-college-navy.jpeg", 149.99))
        }
    }
}
