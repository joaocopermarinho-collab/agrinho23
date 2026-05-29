// Elementos do DOM
const btnTheme = document.getElementById('btn-theme');
const btnAction = document.getElementById('btn-action');
const countProd = document.getElementById('counter-prod');
const countWater = document.getElementById('counter-water');
const countCo2 = document.getElementById('counter-co2');

// 1. Alternar Tema (Modo Escuro / Claro)
btnTheme.addEventListener('click', () => {
    document.body.classList.toggle('dark-mode');
});

// 2. Botão de Ação Interativo
btnAction.addEventListener('click', () => {
    alert('Obrigado pelo interesse! Unir tecnologia e sustentabilidade garante alimentos hoje e recursos amanhã.');
});

// 3. Simulação de Dados em Tempo Real (Atualização constante)
let producao = 10450;
let agua = 52300;
let co2 = 1240;

function atualizarMetricas() {
    // Incrementos simulados aleatórios
    producao += Math.floor(Math.random() * 3) + 1;
    agua += Math.floor(Math.random() * 15) + 5;
    co2 += Math.floor(Math.random() * 2) + 1;

    // Atualiza a tela com formatação numérica local
    countProd.textContent = producao.toLocaleString('pt-BR');
    countWater.textContent = agua.toLocaleString('pt-BR');
    countCo2.textContent = co2.toLocaleString('pt-BR');
}

// Executa a função a cada 2 segundos
setInterval(atualizarMetricas, 2000);

// Inicializa os valores na primeira carga da página
atualizarMetricas();
