# Sistema-de-E-Commerce
Sistema criado com Java e Spring Boot para o projeto final de Programação para Internet

## Objetivo
Uma loja online para compra e venda de produtos variados.

## Funcionalidades
- Exibir catalogo de produtos
- Permitir a compra de produtos
- Permitir o cadastro de lojas
- Permitir o cadastro de usuários
- Permitir o cadastro de produtos pela lojas
- Exibir abas das categorias dos produtos
- Permitir relacionar produtos a categorias, pelas lojas
- Mecanismo de pesquisa por produtos
- Visualizar as páginas das lojas
- Visualizar a descrição dos produtos
- Visualizar o perfil do usuário
- Visualizar o carrinho de compras
- Visualizar o histórico de compras
- Permitir cadastro de lista de desejos
- Permitir avaliar produtos e adicionar comentários
- Permitir cadastrar endereço no usuário

## Logística
- Lojas -- CNPJ, nome, logo, descrição, produtos, formas de contato.
- Produtos -- ID, nome, marca, descrição, vendedor, categorias, avaliações, imagens, preço.
- Usuários -- CPF, nome, e-mail, senha, endereço, foto de perfil, listas de compras, carrinho de compras, pedidos.
- Listas -- Usuário, produtos.
- Carrinho de compras -- Usuário, produtos, preço total.
- Avaliações -- Produto, usuário, nota, resenha, imagens e vídeos.