# N2PO
Trabalho feito em dupla com Ícaro Botelho.

O código que montamos tem como base o uso de um Hashmap combinado com a classe scanner do Java para adicionar contatos no Hashmap, sendo os seus nomes o valor e seus números a chave.

A classe GerenciadorDeClasses é responsável por todas as operações que envolvem manipulação de contatos, como remover, adicionar, listar, procurar e gravação ou leitura em disco. Este código conta com o recurso FileOutputStream, que grava as informações do Hashmap em um arquivo gerado pelo próprio programa, o arquivo "agenda". As operações de gravação e leitura em disco possuem cada uma um try e catch, sendo o catch responsável por uma exception.

Além disso, o código também conta com uma subclasse Empresa, que herda da classe pai GerenciadorDeClasses, e ela é responsável por adicionar contatos empresariais, utilizando o mesmo método presente na classe pai, porém com algumas alterações, como a adição do termo "Empresa:" antes do nome do contato, e também a data em que o mesmo foi adicionado, obtida utilizando as ferramentas presentes no java.time. Utilizando a herança e polimorfismo, não foi necessário implementar uma classe totalmente diferente para fazer algo que já existia no programa.
