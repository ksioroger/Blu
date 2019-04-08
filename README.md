# Blu - Gerenciador de estoque #

## Descrição ## 
Gerenciador em JAVA com armazenamento em Banco Mysql e criptografia MD5(assimétrica) e AES(simétrica).

No menu **_Sobre_** é possível acessar os atalhos do programa e informações sobre o sistema.

No menu **_Usuário_**, é possível acessar as opções trocar usuário, onde o usuário ativo será encerrado e solicitado o logon do novo usuário, sair do sistema e gerenciamento da conta de usário atual, com as funções de trocar senha, cadastrar um novo usuário ou ainda excluir, neste caso o sistema irá realizar a remoção do usuário e também a remoção das senhas que são de própriedade do usuário removido.

### Funcionamento:
Ao realizar o cadastro no sistema a senha mestre de acesso ao gerenciado de senhas é criptografada com MD5, junto disso é gerado uma chave que será utilizada para cifrar/descifrar com AES todas as senhas cadastradas no sistema, de forma que somente o proprietário daquela conta possa gerenciar as senhas no cofre.

### Execução:


Caso deseje informações mais detalhadas e personalizações de banco acesse, a [WIKI](https://github.com/ksioroger/Note/wiki) para mais informações.

### Manutenção:
* Cassiano Rogério          cassiano.roger@gmail.com