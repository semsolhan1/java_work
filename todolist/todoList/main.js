
const $box = document.querySelector('.todolist-box');
const $todoInput = document.querySelector('#todo-input');
const $sec = document.querySelector('.todolist');

// console.log($box);
// console.log($todoInput);
// console.log($sec);

// 각 이미지에 이벤트 리스너 추가
$box.addEventListener('click', e => {
    // console.log(e.target);
    if(e.target.matches('.add')) {
        // console.log('add 클릭!');
        console.log($todoInput.value);
        addTodoList($todoInput.value, e.target);
    } else if(e.target.matches('.confirm')) {
        console.log('confirm 클릭!');
        modifyEnd(e.target);
    } else if(e.target.matches('.modify')) {
        console.log('modify 클릭!');
        console.log(e.target);
        const $todo = e.target.parentNode.parentNode.querySelector('.todo');
        $todo.addEventListener('input', e => {
            $todo.setAttribute('value', e.target.value);
        });
        modifyStart(e.target);
    } else if(e.target.matches('.delete')) {
        console.log('delete 클릭!');
        delAnimation(e.target);
        setTimeout(() => {
            deleteTodo(e.target)
        }, 800);
    }
    else return;
});

// $box.addEventListener('change', e => {

// })

// 할 일을 입력 받아서 추가
function addTodoList(todo, target) {
    if(todo === '') {
        inputAnimation(target);
        return;
    }
    const $copyUl = document.getElementById('copy');
    const $cloneUl = $copyUl.cloneNode(true);
    $cloneUl.removeAttribute('id');
    $cloneUl.querySelector('.todo').setAttribute('value', todo);
    $sec.appendChild($cloneUl);
    $todoInput.value = '';
    $todoInput.focus();
    // console.log('추가 완료');
};

// 할 일 수정 시작
function modifyStart(target) {
    target.classList.toggle('lnr-undo');
    target.classList.toggle('lnr-checkmark-circle');
    const $todo = target.parentNode.parentNode.querySelector('.todo');
    $todo.focus();
    if($todo.readOnly === true) $todo.readOnly = false;
    target.classList.toggle('modify');
    target.classList.toggle('confirm');
};

// 할 일 수정 완료
function modifyEnd(target) {
    target.classList.toggle('lnr-checkmark-circle');
    target.classList.toggle('lnr-undo');
    const $todo = target.parentNode.parentNode.querySelector('.todo');
    if(!$todo.hasAttribute('readonly')) $todo.setAttribute('readOnly', 'true');
    target.classList.toggle('confirm');
    target.classList.toggle('modify');
};

// 삭제 애니메이션
function delAnimation(target) {
    target.parentNode.parentNode.classList.toggle('delMoving');
};

// 삭제 기능
function deleteTodo(target) {
    $sec.removeChild(target.parentNode.parentNode);
};

// 체크 시 삭선 적용
$box.addEventListener('change', (e) => {
    const $todo = e.target.parentNode.parentNode.querySelector('.todo');
    if(!e.target.matches('.check')) return;
    if(e.target.checked) {
        $todo.style.textDecoration = 'line-through';
        $todo.style.opacity = 0.3;
    } else {
        $todo.style.textDecoration = 'none';
        $todo.style.opacity = 1;
    }
});

// 필수사항 애니메이션
function inputAnimation(target) {
    // console.log(target.parentNode.previousElementSibling);
    target.parentNode.previousElementSibling.placeholder = '할 일은 필수 입력사항입니다!';
    target.parentNode.previousElementSibling.classList.toggle('inputMoving');
    setTimeout(() => {
        target.parentNode.previousElementSibling.placeholder = '할 일을 입력하세요.';
        target.parentNode.previousElementSibling.classList.toggle('inputMoving');
    }, 3000);
};

const $addBtn = document.querySelector('span.add');
$todoInput.addEventListener('keydown', e => {
    if(e.keyCode === 13) {
        $addBtn.click();
    }
});