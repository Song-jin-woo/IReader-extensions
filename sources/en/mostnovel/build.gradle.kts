listOf("en").map { lang ->
  Extension(
    name = "MostNovel",
    versionCode = 2,
    libVersion = "1",
    lang = lang,
    description = "",
    nsfw = false,
  )
}.also(::register)
