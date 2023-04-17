// 게임에 필요한 정보를 저장할 객체
const gameData = {
    rn : 0,
    choices: ['가위', '바위', '보'],
    computerChoice: '',
    userChoice: '',
    result: '',
    gameCount: 0,
    winCount: 0,
    drawCount: 0,
    defeatCount: 0
};

// 버튼에 리스너 추가
const $btn = document.getElementById('buttons');
const $resultBtn = document.getElementById('resultBtns');

$btn.addEventListener('click', e => {
    if(e.target.matches('button')) {
        const decisionRn = decisionRandomChoice();
        const decisionNum = decisionUserChoice(e.target);
        // console.log('decisionUserChoice 완료');
        saveValue(decisionRn, decisionNum);
        // console.log('saveValue 완료');
        judgeResult();
        // console.log('judgeResult 완료');
        showResult();
        // console.log('showResult 완료');
    }
    else return;
});

$resultBtn.addEventListener('click', e => {
    if (e.target.matches('#restart')) {
        // console.log('다시하기 클릭됌!');
        restart();
    } else if (e.target.matches('#quit')) {
        // console.log('그만하기 클릭됌!');
        quit();
    }
});

// 가위바위보 값을 결정할 난수 생성 함수
function decisionRandomChoice() {
    gameData.rn = Math.floor(Math.random() * 3);
    // console.log(gameData.rn);
    return gameData.rn;
};

// 유저가 선택한 가위바위보 값 전달
function decisionUserChoice(target) {
    let decisionNum = 0;
    if (target.matches('#scissors')) {
        // console.log('가위');
        return decisionNum;
    } else if (target.matches('#rock')) {
        // console.log('바위');
        return decisionNum = 1;
    } else if (target.matches('#paper')) {
        // console.log('보');
        return decisionNum = 2;
    }
};

// 객체에 결정된 값 저장
function saveValue(decisionRn, decisionNum) {
    gameData.computerChoice = gameData.choices[decisionRn];
    gameData.userChoice = gameData.choices[decisionNum];
    // console.log(gameData.computerChoice);
    // console.log(gameData.userChoice);
};

// 객체에 저장된 값을 바탕으로 승부 판정 후 카운트 값 적용
function judgeResult() {
    const {computerChoice, userChoice} = gameData;
    const $totals = document.querySelectorAll('.count-box .total em');
    const $wins = document.querySelectorAll('.count-box .win em');
    const $draws = document.querySelectorAll('.count-box .draw em');
    const $defeats = document.querySelectorAll('.count-box .defeat em');

    if (userChoice === computerChoice) {
        gameData.result = '비겼습니다.';
        gameData.gameCount++;
        gameData.drawCount++;
        [...$totals].forEach($total => {
            $total.textContent = gameData.gameCount;
        });
        [...$draws].forEach($draw => {
            $draw.textContent = gameData.drawCount;
        });
    } else if (userChoice === '바위' && computerChoice === '가위' || userChoice === '가위' && computerChoice === '보' ||
        userChoice === '보' && computerChoice === '바위') {
        gameData.result = '이겼습니다!';
        gameData.gameCount++;
        gameData.winCount++;
        [...$totals].forEach($total => {
            $total.textContent = gameData.gameCount;
        });
        [...$wins].forEach($win => {
            $win.textContent = gameData.winCount;
        });
    } else {
        gameData.result = '졌습니다...';
        gameData.gameCount++;
        gameData.defeatCount++;
        [...$totals].forEach($total => {
            $total.textContent = gameData.gameCount;
        });
        [...$defeats].forEach($defeat => {
            $defeat.textContent = gameData.defeatCount;
        });
    }
};

// 결과값 출력
function showResult() {
    const $buttons = document.querySelector('#buttons');
    const $result = document.querySelector('#result');
    const $resultText = document.querySelector('.result-text'); 
    const $computerChoice = document.querySelector('#computer-choice');
    const $userChoice = document.querySelector('#user-choice');

    $computerChoice.classList.toggle('selected');
    $userChoice.classList.toggle('selected');
    $computerChoice.style.backgroundImage = 'url(./images/' + gameData.computerChoice + '.png)';
    $userChoice.style.backgroundImage = 'url(./images/' + gameData.userChoice + '.png)';
    $resultText.insertAdjacentHTML('afterbegin', '컴퓨터: ' + gameData.computerChoice + '<br>사용자: ' + gameData.userChoice + '<br>' + gameData.result)
    $buttons.classList.toggle('hide');
    $result.classList.toggle('hide');
};

// 다시하기
function restart() {
    const $buttons = document.querySelector('#buttons');
    const $result = document.querySelector('#result');
    const $resultText = document.querySelector('.result-text');
    const $computerChoice = document.querySelector('#computer-choice');
    const $userChoice = document.querySelector('#user-choice');

    $computerChoice.classList.toggle('selected');
    $userChoice.classList.toggle('selected');
    $resultText.textContent = '';
    $buttons.classList.toggle('hide');
    $result.classList.toggle('hide');
};

// 그만하기
function quit() {
    const $progBox = document.getElementById('progress-box');
    const $end = document.getElementById('end');
    const $endText = document.querySelector('.end-text');

    if(gameData.winCount > gameData.defeatCount) {
        $endText.textContent = '축하합니다! 승리하셨습니다!'
    } else if(gameData.winCount < gameData.defeatCount) {
        $endText.textContent = '아쉽네요. 패배하셨습니다...'
    } else {
        $endText.textContent = '아쉽네요. 비겼습니다.'
    }

    $progBox.classList.toggle('hide');
    $end.classList.toggle('hide');
};


// 인트로 효과
const introTitle = document.getElementsByClassName("intro__title")[0];

// 타이틀 문구 타이핑
const title = "신나는\n가위 바위 보\n게임!";

let cnt = 0;
let timer = 0;

function typingIntroTitle() {
    let character = title[cnt++];

    if (character === "\n") {
        introTitle.innerHTML = introTitle.innerHTML + "<br/>";
    } else {
        introTitle.innerHTML = introTitle.innerHTML + character;
    }

    if (cnt === title.length) {
        clearInterval(timer);
        return;
    }
};

window.onload = function() {
    timer = setInterval(typingIntroTitle, 200);
};