# 📝 TaskMaster - Gestão Inteligente de Tarefas

O **TaskMaster** é uma aplicação Full Stack desenvolvida para organizar o fluxo de trabalho diário. O diferencial deste projeto é a gestão visual de prioridades, permitindo identificar rapidamente o que é urgente através de um sistema de cores dinâmico.

## 🚀 Funcionalidades
- **CRUD Completo:** Criação, listagem, conclusão e exclusão de tarefas.
- **Gestão de Prioridades:** Categorização em Baixa, Média e Alta.
- **Interface Inteligente:** Cards que mudam de cor conforme a urgência (utilizando Tailwind CSS).
- **Persistência de Dados:** Uso de banco de dados para garantir que suas tarefas não sumam ao fechar o app.

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java 21
- **Framework:** Spring Boot 3.x
- **Persistência:** Spring Data JPA + H2 Database
- **Template Engine:** Thymeleaf
- **Estilização:** Tailwind CSS (via CDN)
- **Validação de Datas:** LocalDateFormat para prazos de entrega

## 📸 Demonstração
<p align="center">
  <img width="700" src="<img width="1060" height="918" alt="Image" src="https://github.com/user-attachments/assets/dbf8ddf3-bd62-4119-bbb2-98a66e58ea89" />" alt="Demonstração do TaskMaster">
</p>

## ⚙️ Como executar
1. Clone este repositório.
2. Certifique-se de ter o JDK 21 instalado.
3. Execute o comando `./mvnw spring-boot:run`.
4. Acesse no seu navegador: `http://localhost:8080/tarefas`.

---
Desenvolvido por Paulo Henrique dos Anjos como parte dos meus estudos em Spring Boot.