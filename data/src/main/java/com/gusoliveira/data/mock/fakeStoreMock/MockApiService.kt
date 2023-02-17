import com.gusoliveira.data.api.MyStoreService
import com.gusoliveira.data.model.itemProduct.ItemProduct
import com.gusoliveira.data.model.itemProduct.Rating

class MockApiService : MyStoreService {

/*de que modo posso configurar este codigo
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://fakestoreapi.com/")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

para que quando essa rota seja acessada

    @GET("products/category/{id}")
    suspend fun getProductsByCategory(@Path("id") params: String): List<ItemProduct>

ele retorne esses dados mockados?

    val listCategories = listOf(
    "electronics",
    "jewelery",
    "men's clothing",
    "women's clothing"
)
*/

    private val listElectronics = listOf(
        ItemProduct(
            9,
            "WD 2TB Elements Portable External Hard Drive - USB 3.0 ",
            64.0,
            "USB 3.0 and USB 2.0 Compatibility Fast data transfers Improve PC Performance High Capacity; Compatibility Formatted NTFS for Windows 10, Windows 8.1, Windows 7; Reformatting may be required for other operating systems; Compatibility may vary depending on user’s hardware configuration and operating system",
            "electronics",
            "https://fakestoreapi.com/img/61IBBVJvSDL._AC_SY879_.jpg",
            Rating(
                rate = 3.3,
                count = 203
            )
        ),
        ItemProduct(
            10,
            "SanDisk SSD PLUS 1TB Internal SSD - SATA III 6 Gb/s",
            109.0,
            "Easy upgrade for faster boot up, shutdown, application load and response (As compared to 5400 RPM SATA 2.5” hard drive; Based on published specifications and internal benchmarking tests using PCMark vantage scores) Boosts burst write performance, making it ideal for typical PC workloads The perfect balance of performance and reliability Read/write speeds of up to 535MB/s/450MB/s (Based on internal testing; Performance may vary depending upon drive capacity, host device, OS and application.)",
            "electronics",
            "https://fakestoreapi.com/img/61U7T1koQqL._AC_SX679_.jpg",
            Rating(
                rate = 2.9,
                count = 470
            )
        ),
        ItemProduct(
            11,
            "Silicon Power 256GB SSD 3D NAND A55 SLC Cache Performance Boost SATA III 2.5",
            109.0,
            "3D NAND flash are applied to deliver high transfer speeds Remarkable transfer speeds that enable faster bootup and improved overall system performance. The advanced SLC Cache Technology allows performance boost and longer lifespan 7mm slim design suitable for Ultrabooks and Ultra-slim notebooks. Supports TRIM command, Garbage Collection technology, RAID, and ECC (Error Checking & Correction) to provide the optimized performance and enhanced reliability.",
            "electronics",
            "https://fakestoreapi.com/img/71kWymZ+c+L._AC_SX679_.jpg",
            Rating(
                rate = 4.8,
                count = 319
            )
        ),
        ItemProduct(
            12,
            "WD 4TB Gaming Drive Works with Playstation 4 Portable External Hard Drive",
            114.0,
            "Expand your PS4 gaming experience, Play anywhere Fast and easy, setup Sleek design with high capacity, 3-year manufacturer's limited warranty",
            "electronics",
            "https://fakestoreapi.com/img/61mtL65D4cL._AC_SX679_.jpg",
            Rating(
                rate = 4.8,
                count = 400
            )
        ),
        ItemProduct(
            13,
            "Acer SB220Q bi 21.5 inches Full HD (1920 x 1080) IPS Ultra-Thin",
            599.0,
            "21. 5 inches Full HD (1920 x 1080) widescreen IPS display And Radeon free Sync technology. No compatibility for VESA Mount Refresh Rate: 75Hz - Using HDMI port Zero-frame design | ultra-thin | 4ms response time | IPS panel Aspect ratio - 16: 9. Color Supported - 16. 7 million colors. Brightness - 250 nit Tilt angle -5 degree to 15 degree. Horizontal viewing angle-178 degree. Vertical viewing angle-178 degree 75 hertz",
            "electronics",
            "https://fakestoreapi.com/img/81QpkIctqPL._AC_SX679_.jpg",
            Rating(
                rate = 2.9,
                count = 250
            )
        ),
        ItemProduct(
            14,
            "Samsung 49-Inch CHG90 144Hz Curved Gaming Monitor (LC49HG90DMNXZA) – Super Ultrawide Screen QLED ",
            999.99,
            "49 INCH SUPER ULTRAWIDE 32:9 CURVED GAMING MONITOR with dual 27 inch screen side by side QUANTUM DOT (QLED) TECHNOLOGY, HDR support and factory calibration provides stunningly realistic and accurate color and contrast 144HZ HIGH REFRESH RATE and 1ms ultra fast response time work to eliminate motion blur, ghosting, and reduce input lag",
            "electronics",
            "https://fakestoreapi.com/img/81Zt42ioCgL._AC_SX679_.jpg",
            Rating(
                rate = 2.2,
                count = 140
            )
        )
    )

    private val listJewelery = listOf(
        ItemProduct(
            5,
            "John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet",
            695.0,
            "From our Legends Collection, the Naga was inspired by the mythical water dragon that protects the ocean's pearl. Wear facing inward to be bestowed with love and abundance, or outward for protection.",
            "jewelery",
            "https://fakestoreapi.com/img/71pWzhdJNwL._AC_UL640_QL65_ML3_.jpg",
            Rating(
                rate = 4.6,
                count = 400
            )
        ),
        ItemProduct(
            6,
            "Solid Gold Petite Micropave ",
            168.0,
            "Satisfaction Guaranteed. Return or exchange any order within 30 days.Designed and sold by Hafeez Center in the United States. Satisfaction Guaranteed. Return or exchange any order within 30 days.",
            "jewelery",
            "https://fakestoreapi.com/img/61sbMiUnoGL._AC_UL640_QL65_ML3_.jpg",
            Rating(
                rate = 3.9,
                count = 70
            )
        ),
        ItemProduct(
            7,
            "White Gold Plated Princess",
            9.99,
            "Classic Created Wedding Engagement Solitaire Diamond Promise Ring for Her. Gifts to spoil your love more for Engagement, Wedding, Anniversary, Valentine's Day...",
            "jewelery",
            "https://fakestoreapi.com/img/71YAIFU48IL._AC_UL640_QL65_ML3_.jpg",
            Rating(
                rate = 3.0,
                count = 400
            )
        ),
        ItemProduct(
            8,
            "Pierced Owl Rose Gold Plated Stainless Steel Double",
            10.99,
            "Rose Gold Plated Double Flared Tunnel Plug Earrings. Made of 316L Stainless Steel",
            "jewelery",
            "https://fakestoreapi.com/img/51UDEzMJVpL._AC_UL640_QL65_ML3_.jpg",
            Rating(
                rate = 1.9,
                count = 100
            )
        ),





        ItemProduct(
            108,
            "Conjunto relógio masculino corrente cruz e pulseira banhado a ouro 18k",
            99.99,
            "Enviamos peças com as melhores qualidades.\n" +
                    "Aqui você encontra relógios que foram revisados antes do envio.\n" +
                    "Não se preocupe enviamos seu pedido no mesmo dia da compra, se você fez antes das 12:00 será enviado no mesmo dia é nosso compromisso com você Piltover sabe como você se sente quando seu produto não é enviado rapidamente.\n" +
                    "\n" +
                    "Conjunto relógio masculino + corrente cruz e pulseira banhado a ouro 18k\n" +
                    "\n" +
                    "Kit acompanha Relógio grande restante\n" +
                    "\n" +
                    "Corrente 3mm aço inox\n" +
                    "Pingente\n" +
                    "E Pulseira 3mm aço inox\n" +
                    "\n" +
                    "Kit top\n" +
                    "Atenção a caixinha da foto da capa não acompanha o kit",
            "jewelery",
            "https://images-americanas.b2w.io/produtos/6160096996/imagens/conjunto-relogio-masculino-corrente-cruz-e-pulseira-banhado-a-ouro-18k/6160096996_1_xlarge.jpg",
            Rating(
                rate = 3.9,
                count = 100
            )
        ),
        ItemProduct(
                80,
        "Par Aliança de Casamento ou Noivado em ouro 18k com a base interna em Prata 995 - Always06",
        1510.99,
        "Atenção: Após a compra meça o tamanho dos dedos conforme a última foto do anúncio, logo após envie pelo chat para informar rapidamente as medidas dos aros junto com as gravações dos nomes e data. Lembrando que isto é fundamental para que suas alianças cheguem o mais rápido possível.\n" +
                "\n" +
                "Garantia da fábrica Garantia permanente para limpeza e polimento (custo do frete por conta do cliente) Troca de numeração até 10 dias após receber as alianças. Troca direto pela Fábrica. Este período serve para que haja adaptação ao uso das alianças para confirmar se a aliança ficou larga ou apertada. Caso confirme a necessidade de troca não haverá custo. Tamanhos masculinos e femininos: Do 10 ao 35.\n" +
                "\n" +
                "Aliança de Casamento ou Noivado em ouro 18k com a base interna em Prata 995 - Always06\n" +
                "\n" +
                "O Par de Alianças de Casamento ou de Noivado da linha Always é confeccionado em Ouro 18K maciço com um anel interno em Prata 995 que é a mais pura do mercado. Acompanha um lindo Anel Solitário todo em Prata 995 com uma maravilhosa pedra no meio, além de outros detalhes.\n" +
                "\n" +
                "Após realizar a compra você deverá preencher, o mais rápido possível, a numeração correta dos dedos e a gravação que será feita. As Alianças Pipper Joias são feitas sob encomenda, quanto mais rápido enviar as medidas, mais rápido chegará até você.\n" +
                "\n" +
                "As Alianças de Casamentos ou de Noivado na Pipper Joias são confeccionadas artesanalmente em nossa fábrica. Nossos ourives são artesãos que esculpem cada detalhe da peça tornando-as únicas.\n" +
                "\n" +
                "A linha Always é umas das queridinhas dos clientes, uma das peças mais compradas em nossa loja. Alguns clientes optam por fazer pequenas alterações em seu design para garantir uma exclusividade na peça, acrescentando ou tirando detalhes.\n" +
                "\n" +
                "Esta Joia simboliza a maturidade do relacionamento! Este é o modelo ideal para você que busca por um Par de Alianças de Noivado ou de Casamento, além do tradicional.\n" +
                "\n" +
                "especificações do produto\n" +
                "Dimensão: 5 mm x 1.6 mm (Largura X Altura)\n" +
                "Peso: 12 gramas total do par\n" +
                "Metal: Ouro Amarelo 18k 750 e Prata 995\n" +
                "Acabamento: Polida\n" +
                "Conforto: Tradicional\n" +
                "Pedra: Pedras Diamonic disponíveis na Aliança Feminina\n" +
                "Perguntas frequentes\n" +
                "\n" +
                "1 - Gravação é gratuita?\n" +
                "r: Sim, gravação de nome e data é cortesia.\n" +
                "2 - Vai com a caixinha para Joia?\n" +
                "r: Sim, Estojo Luxo na cor preta, conforme foto do anúncio.\n" +
                "3 - Qual o prazo de envio?\n" +
                "r: O prazo é contado a partir da data em que foi encaminhado os dados de numeração e gravação.\n" +
                "4 - Onde devo encaminhar a numeração e gravação?\n" +
                "r: Numeração e gravação devem ser encaminhadas no campo de mensagem ou em perguntas e respostas.\n" +
                "5 - Como eu sei o tamanho do meu dedo?\n" +
                "r: Para achar a numeração correta das alianças siga o método que está na foto do anuncio.\n" +
                "6- Minhas alianças estão ficando escura, o que devo fazer?\n" +
                "r: Não se preocupe, as alianças em Prata 995 podem escurecer ao ser exposto em contato com produto químico e também o próprio ácido úrico, caso isso ocorra junto com o produto vai informando o procedimento de limpeza em casa, caso não dê certo pode encaminhar o produto para empresa para fazermos a limpeza e polimento pela garantia eterna.",
        "jewelery",
        "https://images-americanas.b2w.io/produtos/3768440302/imagens/par-alianca-de-casamento-ou-noivado-em-ouro-18k-com-a-base-interna-em-prata-995-always06/3768440302_1_xlarge.jpg",
        Rating(
            rate = 4.9,
            count = 100
        )
    )
    )

    private val listMenClothing = listOf(
        ItemProduct(
            1,
            "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
            109.95,
            "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
            "men's clothing",
            "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
            Rating(
                rate = 3.90,
                count = 120
            )
        ),
        ItemProduct(
            2,
            "Mens Casual Premium Slim Fit T-Shirts ",
            22.30,
            "Slim-fitting style, contrast raglan long sleeve, three-button henley placket, light weight & soft fabric for breathable and comfortable wearing. And Solid stitched shirts with round neck made for durability and a great fit for casual fashion wear and diehard baseball fans. The Henley style round neckline includes a three-button placket.",
            "men's clothing",
            "https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_.jpg",
            Rating(
                rate = 4.1,
                count = 259
            )
        ),
        ItemProduct(
            3,
            "Mens Cotton Jacket",
            55.99,
            "great outerwear jackets for Spring/Autumn/Winter, suitable for many occasions, such as working, hiking, camping, mountain/rock climbing, cycling, traveling or other outdoors. Good gift choice for you or your family member. A warm hearted love to Father, husband or son in this thanksgiving or Christmas Day.",
            "men's clothing",
            "https://fakestoreapi.com/img/71li-ujtlUL._AC_UX679_.jpg",
            Rating(
                rate = 4.7,
                count = 500
            )
        ),
        ItemProduct(
            4,
            "Mens Casual Slim Fit",
            15.99,
            "The color could be slightly different between on the screen and in practice. / Please note that body builds vary by person, therefore, detailed size information should be reviewed below on the product description.",
            "men's clothing",
            "https://fakestoreapi.com/img/71YXzeOuslL._AC_UY879_.jpg",
            Rating(
                rate = 2.1,
                count = 430
            )
        ),
        ItemProduct(
            52,
            "Kit 3 Camisetas Masculina Lisa Básica Premium 100% Algodão",
            52.90,
            "Versatilidade e estilo definem esse kit de camisetas. Produzidas em algodão, elas proporcionam maior conforto e suavidade no uso, dando uma sensação refrescante. Seu uso combina com qualquer outra peça de roupa, te proporcionando mais segurança.",
            "men's clothing",
            "https://images-americanas.b2w.io/produtos/5730631613/imagens/kit-3-camisetas-masculina-lisa-basica-premium-100-algodao/5730631752_1_xlarge.jpg",
            Rating(
                rate = 3.1,
                count = 430
            )
        ),

        ItemProduct(
            152,
            "Kit 5 Bermudas Moletom Masculina Academia Shorts Fitnes Full",
            52.90,
            "t 5 Bermudas moletom, produto 100% Original.\n" +
                    "\n" +
                    "Os kits já estão montados e embalados nas cores sortidas.\n" +
                    "\n" +
                    "Frete Grátis*\n" +
                    "\n" +
                    "Produzido no Brasil com alto padrão de qualidade com preço justo.\n" +
                    "\n" +
                    "2 Bolsos na frente\n" +
                    "Temos nos Tamanhos p, m, G e gg\n" +
                    "Os kits já estão montados e embalados nas cores sortidas.\n" +
                    "\n" +
                    "Produzido no Brasil com alto padrão de qualidade com preço justo.\n" +
                    "Temos tudo a pronta entrega nas cores Preto, Grafite, Cinza ou Azul Marinho.\n" +
                    "Temos nos Tamanhos p, m, G e gg\n" +
                    "\n" +
                    "perguntas frequentes\n" +
                    "\n" +
                    "- O kit pode ser enviado por tamanhos diferentes?\n" +
                    "O kit é enviado completo com a mesma numeração.\n" +
                    "\n" +
                    "- Você faz o faturamento B2B/ para cnpj?\n" +
                    "Somente faturamos para nosso consumidor final, ou seja, não realizamos compras para empresas por este portal.\n" +
                    "\n" +
                    "obs: não tem como realizar A escolha das cores, modelos E tamanhos variados. obrigado\n" +
                    "\n" +
                    "***Medidas***\n" +
                    "p. Largura 38 cm, Comprimento 51 cm\n" +
                    "m. Largura 40 cm, comprimento 52 cm\n" +
                    "g. Largura 43 cm, comprimento 54 cm\n" +
                    "gg. Largura 44 cm, comprimento 57 cm\n" +
                    "\n" +
                    "Obs: As fotos são reais do produto.",
            "men's clothing",
            "https://images-americanas.b2w.io/produtos/5183534805/imagens/kit-5-bermudas-moletom-masculina-academia-shorts-fitnes-full/5183534848_3_xlarge.jpg",
            Rating(
                rate = 2.1,
                count = 400
            )
        )


    )

    private val listWomenClothing = listOf(
        ItemProduct(
            15,
            "BIYLACLESEN Women's 3-in-1 Snowboard Jacket Winter Coats",
            56.99,
            "Note:The Jackets is US standard size, Please choose size as your usual wear Material: 100% Polyester; Detachable Liner Fabric: Warm Fleece. Detachable Functional Liner: Skin Friendly, Lightweigt and Warm.Stand Collar Liner jacket, keep you warm in cold weather. Zippered Pockets: 2 Zippered Hand Pockets, 2 Zippered Pockets on Chest (enough to keep cards or keys)and 1 Hidden Pocket Inside.Zippered Hand Pockets and Hidden Pocket keep your things secure. Humanized Design: Adjustable and Detachable Hood and Adjustable cuff to prevent the wind and water,for a comfortable fit. 3 in 1 Detachable Design provide more convenience, you can separate the coat and inner as needed, or wear it together. It is suitable for different season and help you adapt to different climates",
            "women's clothing",
            "https://fakestoreapi.com/img/51Y5NI-I5jL._AC_UX679_.jpg",
            Rating(
                rate = 2.6,
                count = 235
            )
        ),
        ItemProduct(
            16,
            "Lock and Love Women's Removable Hooded Faux Leather Moto Biker Jacket",
            29.95,
            "100% POLYURETHANE(shell) 10	0% POLYESTER(lining) 75% POLYESTER 25% COTTON (SWEATER), Faux leather material for style and comfort / 2 pockets of front, 2-For-One Hooded denim style faux leather jacket, Button detail on waist / Detail stitching at sides, HAND WASH ONLY / DO NOT BLEACH / LINE DRY / DO NOT IRON",
            "women's clothing",
            "https://fakestoreapi.com/img/81XH0e8fefL._AC_UY879_.jpg",
            Rating(
                rate = 2.9,
                count = 340
            )
        ),


        ItemProduct(
            17,
            "Rain Jacket Women Windbreaker Striped Climbing Raincoats",
            39.99,
            "Lightweight perfet for trip or casual wear---Long sleeve with hooded, adjustable drawstring waist design. Button and zipper front closure raincoat, fully stripes Lined and The Raincoat has 2 side pockets are a good size to hold all kinds of things, it covers the hips, and the hood is generous but doesn't overdo it.Attached Cotton Lined Hood with Adjustable Drawstrings give it a real styled look.",
            "women's clothing",
            "https://fakestoreapi.com/img/71HblAHs5xL._AC_UY879_-2.jpg",
            Rating(
                rate = 3.8,
                count = 679
            )
        ),
        ItemProduct(
            18,
            "MBJ Women's Solid Short Sleeve Boat Neck V ",
            9.85,
            "95% RAYON 5% SPANDEX, Made in USA or Imported, Do Not Bleach, Lightweight fabric with great stretch for comfort, Ribbed on sleeves and neckline / Double stitching on bottom hem",
            "women's clothing",
            "https://fakestoreapi.com/img/71z3kpMAYsL._AC_UY879_.jpg",
            Rating(
                rate = 4.7,
                count = 130
            )
        ),
        ItemProduct(
            19,
            "Opna Women's Short Sleeve Moisture",
            7.95,
            "100% Polyester, Machine wash, 100% cationic polyester interlock, Machine Wash & Pre Shrunk for a Great Fit, Lightweight, roomy and highly breathable with moisture wicking fabric which helps to keep moisture away, Soft Lightweight Fabric with comfortable V-neck collar and a slimmer fit, delivers a sleek, more feminine silhouette and Added Comfort",
            "women's clothing",
            "https://fakestoreapi.com/img/51eg55uWmdL._AC_UX679_.jpg",
            Rating(
                rate = 4.5,
                count = 146
            )
        ),
        ItemProduct(
            20,
            "DANVOUY Womens T Shirt Casual Cotton Short",
            12.99,
            "95%Cotton,5%Spandex, Features: Casual, Short Sleeve, Letter Print,V-Neck,Fashion Tees, The fabric is soft and has some stretch., Occasion: Casual/Office/Beach/School/Home/Street. Season: Spring,Summer,Autumn,Winter.",
            "women's clothing",
            "https://fakestoreapi.com/img/61pHAEJ4NML._AC_UX679_.jpg",
            Rating(
                rate = 3.6,
                count = 145
            )
        )


    )

    private val listProducts = listElectronics + listJewelery + listMenClothing + listWomenClothing

    private val listCategories = listOf(
        "electronics",
        "jewelery",
        "men's clothing",
        "women's clothing"
    )

    override suspend fun getProductsByCategory(params: String) = when (params) {
        "electronics" -> listElectronics
        "jewelery" -> listJewelery
        "men's clothing" -> listMenClothing
        "women's clothing" -> listWomenClothing
        else -> {
            listOf()
        }
    }

    override suspend fun getAllProductsList() = listProducts

    override suspend fun getCategoriesList() = listCategories
}