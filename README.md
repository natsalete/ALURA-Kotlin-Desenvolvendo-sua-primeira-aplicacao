<h1 align="center">🎮 AluGames</h1>

<p align="center">
  Aplicação de console em Kotlin para cadastrar gamers e buscar jogos na API pública da CheapShark.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-2.3-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin">
  <img src="https://img.shields.io/badge/Maven-build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven">
  <img src="https://img.shields.io/badge/IntelliJ_IDEA-IDE-000000?style=for-the-badge&logo=intellijidea&logoColor=white" alt="IntelliJ IDEA">
  <img src="https://img.shields.io/badge/Alura-curso-051933?style=for-the-badge" alt="Alura">
</p>

<p align="center">
  <a href="#-sobre">Sobre</a> •
  <a href="#-o-que-aprendi">O que aprendi</a> •
  <a href="#-funcionalidades">Funcionalidades</a> •
  <a href="#-estrutura">Estrutura</a> •
  <a href="#-como-executar">Como executar</a> •
  <a href="#-certificado">Certificado</a>
</p>

---

## 📖 Sobre

Projeto desenvolvido no curso **[Kotlin: desenvolvendo sua primeira aplicação](https://www.alura.com.br/)** da Alura.

O AluGames cadastra um gamer pelo terminal e busca jogos pelo código na [API da CheapShark](https://apidocs.cheapshark.com/). O gamer monta uma lista de jogos buscados, com descrição personalizada, e depois ordena, filtra e remove itens dessa lista.

## 🧠 O que aprendi

- [x] Criar um projeto Kotlin com o **IntelliJ IDEA** e o **Maven**
- [x] Consumir uma **API externa** com `HttpClient` e converter o JSON com **Gson**
- [x] Usar os principais **tipos de dados** e recursos da linguagem: `data class`, construtor secundário, `companion object`, *null safety*, *extension functions* e *scope functions* (`let`, `also`)
- [x] Ler dados digitados pelo usuário com o **`Scanner`**
- [x] Controlar o fluxo com **condicionais**, **loops** (`do-while`, `forEach`) e **exceções** (`runCatching`, `IllegalArgumentException`)

## ✨ Funcionalidades

| Funcionalidade | Descrição |
|---|---|
| 👤 Cadastro de gamer | Nome e e-mail obrigatórios; data de nascimento e usuário opcionais |
| 🏷️ ID interno | Gerado no formato `usuario#0000` quando o usuário é definido |
| 🎂 Cálculo de idade | Extensão `String.tranformarEmIdade()` converte `DD/MM/AAAA` em idade |
| 🔎 Busca de jogos | Consulta a CheapShark pelo código do jogo |
| 📝 Descrição personalizada | O gamer pode escrever a própria descrição do jogo |
| 🗂️ Lista de jogos | Ordenação por título, filtro por nome e remoção por posição |
| ⚠️ Tratamento de erro | Código inexistente mostra uma mensagem e o loop continua |

## 🗃️ Estrutura

```
src/main/kotlin/br/com/alura/alugames
├── modelo
│   ├── Gamer.kt            # Dados do gamer, ID interno e validação de e-mail
│   ├── Jogo.kt             # Título, capa e descrição do jogo
│   ├── InfoJogo.kt         # Resposta da API
│   └── InfoApiShark.kt     # Campos title e thumb da API
├── principal
│   ├── Main.kt             # Fluxo principal da aplicação
│   └── TesteGamer.kt       # Testes manuais da classe Gamer
├── servicos
│   └── ConsumoApi.kt       # Chamada HTTP para a CheapShark
└── utilitario
    └── StringExtension.kt  # Extensão para calcular idade
```

## 🚀 Como executar

**Pré-requisitos:** JDK 11 ou superior e Maven.

### Pelo IntelliJ IDEA

1. Clone o repositório:
   ```bash
   git clone https://github.com/natsalete/ALURA-Kotlin-Desenvolvendo-sua-primeira-aplicacao.git
   ```
2. Abra a pasta no IntelliJ IDEA.
3. Abra `src/main/kotlin/br/com/alura/alugames/principal/Main.kt`.
4. Clique em **Run** ao lado da função `main`.

### Pelo terminal

```bash
mvn compile exec:java -Dexec.mainClass="com.fundamentos.br.com.alura.alugames.principal.MainKt"
```

### Exemplo de uso

```
Boas vindas ao AluGames! Vamos fazer seu cadastro. Digite seu nome:
Natalia
Digite seu e-mail:
natalia@email.com
Deseja completar seu cadastro com usuário e data de nascimento? (S/N)
N
Cadastro concluído com sucesso. Dados do gamer:
...
Digite um código de jogo para buscar:
146
Deseja inserir uma descrição personalizada? S/N
```

> 💡 Códigos de jogo para testar: `146` (Batman: Arkham Asylum GOTY) e `612` (LEGO Batman). Para ver o tratamento de erro, use `1337`, que não existe. Busque outros códigos em `https://www.cheapshark.com/api/1.0/games?title=batman`.

## 🛠️ Tecnologias

- [Kotlin](https://kotlinlang.org/)
- [Maven](https://maven.apache.org/)
- [Gson](https://github.com/google/gson)
- [CheapShark API](https://apidocs.cheapshark.com/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)

## 🏆 Certificado

<p align="center">
  <a href="https://drive.google.com/file/d/12vQOSl2BA1KMigY1fgNcHBEDxlIU3yhq/view?usp=sharing">
    <img src="https://img.shields.io/badge/Ver_certificado-Alura-051933?style=for-the-badge&logo=googledrive&logoColor=white" alt="Ver certificado">
  </a>
</p>

---

<p align="center">
  Feito por <a href="https://github.com/natsalete">Natalia Salete</a>
</p>

