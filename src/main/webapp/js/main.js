// XỬ LÍ DROPDOWN NAVBAR
let menu = document.querySelector(".canvas__open i");
let navbar = document.querySelector(".header .navbar");

menu.addEventListener("click", function () {
  menu.classList.toggle("fa-times");
  navbar.classList.toggle("active");
});

window.onscroll = () => {
  menu.classList.remove("fa-times");
  navbar.classList.remove("active");
  inputSearch.classList.remove("active");

  // xử lí scroll top top
  if (window.scrollY > 60) {
    document.querySelector(".scrool-top").classList.add("active");
  } else {
    document.querySelector(".scrool-top").classList.remove("active");
  }
};

// XỬ LÍ CHỌN label
const list = document.querySelectorAll("label");

function activeLink() {
  list.forEach((item) => {
    item.classList.remove("active");
  });
  this.classList.add("active");
}
list.forEach((item) => item.addEventListener("click", activeLink));

// XỦ LÍ SEARCH
let search = document.querySelector(".search-switch");
let inputSearch = document.querySelector(".search");
let iconSearch = document.querySelector(".inputIcon");

search.addEventListener("click", function () {
  inputSearch.classList.toggle("active");
});

iconSearch.addEventListener("click", function () {
  inputSearch.classList.remove("active");
});

// XỦ LÝ CART
let cartShow = document.querySelector(".js-show-cart");
let cart = document.querySelector(".wrap-header-cart");
let btnHiden = document.querySelector(".iconCart");

cartShow.addEventListener("click", function () {
  cart.classList.add("show-header-cart");
});

btnHiden.addEventListener("click", function () {
  cart.classList.remove("show-header-cart");
});

// XỬ LÝ CHUYỂN HÌNH Ở HOME
let slides = document.querySelectorAll(".slide-container");
let index = 0;
function next() {
  slides[index].classList.remove("active");
  index = (index + 1) % slides.length;
  slides[index].classList.add("active");
}
function prev() {
  slides[index].classList.remove("active");
  index = (index - 1 + slides.length) % slides.length;
  slides[index].classList.add("active");
}

// XỬ LÍ COUNT UP
const counters = document.querySelectorAll(".cn_num");

counters.forEach((counter) => {
  counter.innerText = "0";

  const updateCounter = () => {
    const target = +counter.getAttribute("data-target");

    const c = +counter.innerText;

    const increment = target / 250;

    if (c < target) {
      counter.innerText = `${Math.ceil(c + increment)}`;
      setTimeout(updateCounter, 1);
    } else {
      counter.innerText = target;
    }
  };

  updateCounter();
});
// XỬ LÍ PRODUCT
const $ = document.querySelector.bind(document);
const $$ = document.querySelectorAll.bind(document);

const tabs = $$(".tab-item");
const panes = $$(".tab-pane");

const tabActive = $(".tab-item.active");
const line = $(".tabs .line");

requestIdleCallback(function () {
  line.style.left = tabActive.offsetLeft + "px";
  line.style.width = tabActive.offsetWidth + "px";
});

tabs.forEach((tab, index) => {
  const pane = panes[index];

  tab.onclick = function () {
    $(".tab-item.active").classList.remove("active");
    $(".tab-pane.active").classList.remove("active");

    line.style.left = this.offsetLeft + "px";
    line.style.width = this.offsetWidth + "px";

    this.classList.add("active");
    pane.classList.add("active");
  };
});

//COUNTDOWN
let countDate = new Date("October 20, 2022 12:00:00").getTime();
function countDown() {
  let now = new Date().getTime();
  gap = countDate - now;

  let seconds = 1000;
  let minutes = seconds * 60;
  let hours = minutes * 60;
  let day = hours * 24;

  let d = Math.floor(gap / day);
  let h = Math.floor((gap % day) / hours);
  let m = Math.floor((gap % hours) / minutes);
  let s = Math.floor((gap % minutes) / seconds);

  document.getElementById("days").innerText = d;
  document.getElementById("hours").innerText = h;
  document.getElementById("mitunes").innerText = m;
  document.getElementById("seconds").innerText = s;
}
setInterval(() => {
  countDown();
}, 1000);

