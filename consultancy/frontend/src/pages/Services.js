import React from "react";
import Card from "../components/Card";

const services = [
  { id:1, title:"Project & Programme Management", desc:"End-to-end delivery and site supervision.", image:"/images/service1.jpg" },
  { id:2, title:"Design & Engineering", desc:"Feasibility, detailed design, stress analysis.", image:"/images/service2.jpg" },
  { id:3, title:"Technical Consultancy", desc:"Integrity assessments, hazard analysis, FEA.", image:"/images/service3.jpg" }
];

export default function Services() {
  return (
    <div>
      <section className="page-hero">
        <div className="container">
          <div className="page-hero-content">
            <span className="page-badge">What We Do</span>
            <h1 className="page-title">Our Services</h1>
            <p className="page-description">
              Comprehensive engineering and consultancy solutions tailored to your project needs
            </p>
          </div>
        </div>
      </section>
      
      <section className="container page-content">
        <div className="cards-grid">
          {services.map(s => (
            <Card key={s.id} title={s.title} image={s.image}>{s.desc}</Card>
          ))}
        </div>
      </section>
    </div>
  );
}
