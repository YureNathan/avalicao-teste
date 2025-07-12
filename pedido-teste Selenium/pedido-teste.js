const VALOR_CAMISA = 50.0;
let total_registros = 1;
let pedidos = [];

function add() {
  let aluno = document.querySelector("#aluno").value;

  if (!aluno) {
    alert("É obrigátorio nome do Aluno. Tente novamente!");
  } else {
    let tamanho = document.querySelector("#tamanho").value;
    let cor = document.querySelector("#cor").value;
    incTable(aluno, tamanho, cor);
  }
  limparCampos();
}

function incTable(aluno, tamanho, cor) {
  let table = document.querySelector("#table-lista-pedidos tbody");

  let tr = document.createElement("tr");
  let th_id = document.createElement("th");
  let td_aluno = document.createElement("td");
  let td_tamanho = document.createElement("td");
  let td_cor = document.createElement("td");
  let td_valor = document.createElement("td");
  let td_excluir = document.createElement("td");

  th_id.scope = "row";
  th_id.innerText = total_registros;
  td_aluno.innerText = aluno;
  td_tamanho.innerText = tamanho;
  td_cor.innerText = cor;
  td_valor.innerText = getValorBRL(VALOR_CAMISA);

  let icon_excluir = document.createElement("i");
  icon_excluir.className = "fas fa-trash-can";
  td_excluir.appendChild(icon_excluir);

  addDB({
    id: total_registros,
    aluno: aluno,
    tamanho: tamanho,
    cor: cor,
  });

  tr.appendChild(th_id);
  tr.appendChild(td_aluno);
  tr.appendChild(td_tamanho);
  tr.appendChild(td_cor);
  tr.appendChild(td_valor);
  tr.appendChild(td_excluir);
  table.appendChild(tr);
  total_registros++;
}

function limparCampos() {
  document.querySelector("#aluno").value = "";
}

function addDB(item) {
  pedidos.push(item);
  calcTotal();
}
function calcTotal() {
  let total_pedido = pedidos.length * VALOR_CAMISA;
  document.querySelector("#total-pedido").innerText = getValorBRL(total_pedido);
}

function getValorBRL(valor) {
  return valor.toLocaleString("pt-br", { style: "currency", currency: "BRL" });
}
