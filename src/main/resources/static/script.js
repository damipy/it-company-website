document.addEventListener("DOMContentLoaded", () => {
    const sections = document.querySelectorAll('section');
    
    sections.forEach(section => {
      section.addEventListener('mouseenter', () => {
        section.style.transform = "scale(1.03)";
        section.style.transition = "0.5s";
      });
      section.addEventListener('mouseleave', () => {
        section.style.transform = "scale(1)";
      });
    });
  });
  