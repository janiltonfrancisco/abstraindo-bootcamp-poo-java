 Projeto DIO: Desafio de Orientação a Objetos em Java

Este projeto foi desenvolvido como um desafio prático de programação em Java, com o objetivo de aplicar e consolidar os quatro pilares da Programação Orientada a Objetos (POO): Abstração, Encapsulamento, Herança e Polimorfismo.

A aplicação simula a dinâmica de um bootcamp da DIO, criando e gerenciando entidades como desenvolvedores (Devs), cursos (Cursos), mentorias (Mentorias) e o próprio Bootcamp.

Conceitos de POO Aplicados:

1. Abstração: As classes foram modeladas para representar objetos do mundo real (como Curso e Mentoria) de forma simplificada, focando apenas nos atributos e comportamentos essenciais para a simulação do bootcamp.

2. Encapsulamento: Atributos importantes, como o nome do curso ou a carga horária, foram definidos como private, garantindo que só possam ser acessados ou alterados por meio de métodos públicos (getters e setters). Isso protege os dados e mantém a integridade do sistema.

3. Herança: Uma classe abstrata Conteudo foi criada para ser a base de Curso e Mentoria, que herdam suas características e métodos comuns. Essa abordagem reduz a duplicação de código e torna o projeto mais organizado e escalável.

4. Polimorfismo: O cálculo da experiência (XP) total do Dev é um exemplo de polimorfismo. O método calcularXp() se comporta de maneira diferente para cada tipo de conteúdo (Curso e Mentoria), mesmo que o nome do método seja o mesmo.

->Como o Projeto Funciona

A classe principal (Main) é responsável por orquestrar a simulação do bootcamp:

*Criação de Conteúdos: 

Instâncias de Curso e Mentoria são criadas com seus respectivos dados.

Configuração do Bootcamp: O Bootcamp é instanciado e seus conteúdos são adicionados.

a.Inscrição do Dev: Um objeto Dev é criado e inscrito no Bootcamp.

b.Simulação de Progresso: A simulação avança o progresso do Dev nos conteúdos inscritos.

c.Cálculo e Exibição: O projeto exibe a lista de conteúdos inscritos e concluídos pelo Dev, além de calcular o XP total.
