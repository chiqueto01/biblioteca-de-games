const btn = document.getElementById('theme-toggle');
function applyTheme(theme){
  document.body.classList.remove('theme-dark','theme-light');
  document.body.classList.add(theme);
  localStorage.setItem('theme', theme);
}
applyTheme(localStorage.getItem('theme') || 'theme-dark');
btn?.addEventListener('click', ()=>{
  const cur = localStorage.getItem('theme') || 'theme-dark';
  applyTheme(cur === 'theme-dark' ? 'theme-light' : 'theme-dark');
});
