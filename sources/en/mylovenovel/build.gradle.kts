listOf("en").map { lang ->
  Extension(
    name = "MyLoveNovel",
    versionCode = 8,
    libVersion = "1",
    lang = lang,
    description = "",
    nsfw = false,
    icon = DEFAULT_ICON
  )
}.also(::register)
