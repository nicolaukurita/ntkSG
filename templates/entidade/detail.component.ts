import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { I${entidade.singularPascalCase} } from './${entidade.singularCamelCase}';
import { ${entidade.singularPascalCase}Service } from './${entidade.singularCamelCase}.service';

@Component({
  templateUrl: './${entidade.singularCamelCase}-detail.component.html',
  styleUrls: ['./${entidade.singularCamelCase}-detail.component.css']
})
export class ${entidade.singularPascalCase}DetailComponent implements OnInit {
  pageTitle = '${entidade.singularPascalCase} Detail';
  errorMessage = '';
  ${entidade.singularCamelCase}: I${entidade.singularPascalCase} | undefined;

constructor(private route: ActivatedRoute,
              private router: Router,
              private ${entidade.singularCamelCase}Service: ${entidade.singularPascalCase}Service) {
  }

  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    if (id) {
      this.get${entidade.singularPascalCase}(id);
    }
  }
  get${entidade.singularPascalCase}(id: number): void {
    this.${entidade.singularCamelCase}Service.get${entidade.singularPascalCase}(id).subscribe({
      next: ${entidade.singularCamelCase} => this.${entidade.singularCamelCase} = ${entidade.singularCamelCase},
      error: err => this.errorMessage = err
    });
  }

  onBack(): void {
    this.router.navigate(['/${entidade.pluralCamelCase}']);
  }
}