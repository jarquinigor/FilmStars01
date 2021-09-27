INSERT INTO public.usuario(cusuario, nombreemail, nombrepassword, nombreusuario) VALUES (1, 'admin', 'admin', 'admin');
INSERT INTO public.usuario(cusuario, nombreemail, nombrepassword, nombreusuario) VALUES (2, '123', '123', '123');

INSERT INTO director(cdirector, nombredirector) VALUES (1, 'director1');
INSERT INTO director(cdirector, nombredirector) VALUES (2, 'director2');

INSERT INTO genero(cgenero, nombregenero) VALUES (1, 'genero1');
INSERT INTO genero(cgenero, nombregenero) VALUES (2, 'genero2');

INSERT INTO pelicula(cpelicula, nombrepelicula, argumentopelicula, imagenpelicula, portadapelicula, sinopsispelicula, cdirector) VALUES (1, 'pelicula1', 'argumento de pelicula', '/resources/img/peliculas/pruebaimagen.jpg', '/resources/img/peliculas/pruebaportada.jpg', 'sinopsis', 1);
INSERT INTO noticia(cnoticia, subtitulonoticia, titulonoticia, textonoticia, imagennoticia) VALUES (1, 'The Batman sorprende', 'The batman una película oscura', 'Texto de noticia', '/resources/img/peliculas/pruebaimagen.jpg');
INSERT INTO noticia(cnoticia, subtitulonoticia, titulonoticia, textonoticia, imagennoticia) VALUES (2, 'Subtitulo de noticia 2', 'Titulo de noticia 2', 'Texto de noticia 2', '/resources/img/peliculas/pruebaportada.jpg');
